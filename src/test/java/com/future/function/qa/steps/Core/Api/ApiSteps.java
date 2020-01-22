package com.future.function.qa.steps.Core.Api;

import com.future.function.qa.api.core.auth.AuthAPI;
import com.future.function.qa.api.core.batch.BatchAPI;
import com.future.function.qa.api.core.user.UserAPI;
import com.future.function.qa.data.core.batch.BatchData;
import com.future.function.qa.data.core.resource.ResourceData;
import com.future.function.qa.data.core.user.UserData;
import com.future.function.qa.model.request.core.user.UserWebRequest;
import com.future.function.qa.model.response.base.DataResponse;
import com.future.function.qa.model.response.base.PagingResponse;
import com.future.function.qa.model.response.core.batch.BatchWebResponse;
import com.future.function.qa.model.response.core.user.UserWebResponse;
import com.future.function.qa.model.response.embedded.FileContentWebResponse;
import com.future.function.qa.steps.BaseSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.notNullValue;

public class ApiSteps extends BaseSteps {

  @Steps
  private AuthAPI authAPI;

  @Steps
  private UserAPI userAPI;

  @Steps
  private BatchAPI batchAPI;

  @Autowired
  private ResourceData resourceData;

  @Autowired
  private BatchData batchData;

  @Autowired
  private UserData userData;

  @Then("^auth response should be ok and cookie is present$")
  public void authResponseShouldBeOkAndCookieIsPresent() throws Throwable {

    assertThat(authData.getResponseCode(), equalTo(200));
    assertThat(authData.getCookie(), notNullValue());
  }

  @Then("^auth response should be ok and cookie is unset$")
  public void authResponseShouldBeOkAndCookieIsUnset() throws Throwable {

    assertThat(authData.getResponseCode(), equalTo(200));
    assertThat(authData.getCookie()
                 .getValue(), isEmptyString());
  }

  @Then("^auth response should be unauthorized$")
  public void authResponseShouldBeUnauthorized() throws Throwable {

    assertThat(authData.getResponseCode(), equalTo(401));
  }

  @When("^user do login with email \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void userDoLoginWithEmailAndPassword(String email, String password)
    throws Throwable {

    Response response = authAPI.login(authData.createRequest(email, password));

    authData.setResponse(response);
    authData.setCookie(response.getDetailedCookie(authAPI.getCookieName()));
  }

  @When("^user hit auth endpoint$")
  public void userHitAuthEndpoint() throws Throwable {

    Response response = authAPI.getLoginStatus(authData.getCookie());

    authData.setResponse(response);
  }

  @When("^user hit auth endpoint with cookie$")
  public void userHitAuthEndpointWithCookie() throws Throwable {

    Response response = authAPI.getLoginStatus(authData.getCookie());

    authData.setResponse(response);
    authData.setCookie(response.getDetailedCookie(authAPI.getCookieName()));
  }

  @When("^user hit logout endpoint$")
  public void userHitLogoutEndpoint() throws Throwable {

    Response response = authAPI.logout(authData.getCookie());

    authData.setResponseCode(authData.asBaseResponse(response)
                               .getCode());
    authData.setCookie(response.getDetailedCookie(authAPI.getCookieName()));
  }

  @Given("^user prepare auth request$")
  public void userPrepareAuthRequest() throws Throwable {

    authAPI.prepare();
  }

  @When("^user hit create batch endpoint with name \"([^\"]*)\" and code \"" +
        "([^\"]*)\"$")
  public void userHitCreateBatchEndpointWithNameAndCode(
    String name, String code
  ) throws Throwable {

    Response response = batchAPI.create(
      batchData.createRequest(null, name, code), authData.getCookie());

    batchData.setResponse(response);
  }

  @And("^user hit delete batch endpoint with recorded id$")
  public void userHitDeleteBatchEndpointWithRecordedId() throws Throwable {

    DataResponse<BatchWebResponse> createdResponse =
      batchData.getSingleResponse();
    BatchWebResponse createdResponseData = createdResponse.getData();

    Response response = batchAPI.delete(
      createdResponseData.getId(), authData.getCookie());

    batchData.setResponse(response);
  }

  @And(
    "^user hit create user endpoint with email \"([^\"]*)\", name \"([^\"]*)" +
    "\", role \"([^\"]*)\", address \"" +
    "([^\"]*)\", phone \"([^\"]*)\", avatar \"([^\"]*)\", batch code \"" +
    "([^\"]*)\", university \"([^\"]*)\"$")
  public void userHitCreateUserEndpointWithEmailNameRoleAddressPhoneAvatarBatchCodeUniversity(
    String email, String name, String role, String address, String phone,
    String avatar, String batchCode, String university
  ) throws Throwable {

    String requestAvatarId = Optional.of(avatar)
      .filter("no-avatar"::equals)
      .map(ignored -> StringUtils.EMPTY)
      .orElseGet(() -> this.getFromResourceDataOrDefault(avatar));

    UserWebRequest request = userData.createRequest(null, email, name, role,
                                                    address, phone,
                                                    requestAvatarId, batchCode,
                                                    university
    );

    Response response = userAPI.create(request, authData.getCookie());

    userData.setResponse(response);
  }

  private String getFromResourceDataOrDefault(String defaultValue) {

    return Optional.of(defaultValue)
      .filter(String::isEmpty)
      .map(ignored -> resourceData.getCreatedResponse())
      .map(DataResponse::getData)
      .map(FileContentWebResponse::getId)
      .orElse(defaultValue);
  }

  @And("^qa system do cleanup data for user with name \"([^\"]*)\" and email " +
       "\"([^\"]*)\"$")
  public void qaSystemDoCleanupDataForUserWithNameAndEmail(
    String name, String email
  ) throws Throwable {

    userAPI.prepare();
    userObtainUserIdWithNameAndEmail(name, email);
    userHitDeleteUserEndpointWithRecordedId();
  }

  @And("^user obtain user id with name \"([^\"]*)\" and email \"([^\"]*)\"$")
  public void userObtainUserIdWithNameAndEmail(String name, String email)
    throws Throwable {

    Response getByNameResponse = userAPI.getByName(
      name, 1, 100, authData.getCookie());

    userData.setResponse(getByNameResponse);

    PagingResponse<UserWebResponse> pagingResponse =
      userData.getPagingResponse();
    List<UserWebResponse> pagingResponseData = pagingResponse.getData();

    String targetUserId = pagingResponseData.stream()
      .filter(userWebResponse -> userWebResponse.getEmail()
        .equals(email))
      .map(UserWebResponse::getId)
      .findFirst()
      .orElse(StringUtils.EMPTY);

    userData.setTargetUserId(targetUserId);
  }

  @And("^user hit delete user endpoint with recorded target user id$")
  public void userHitDeleteUserEndpointWithRecordedId() throws Throwable {

    Response response = userAPI.delete(
      userData.getTargetUserId(), authData.getCookie());

    userData.setResponse(response);
  }

  @And("^user prepare user request$")
  public void userPrepareUserRequest() throws Throwable {

    userAPI.prepare();
  }

  @And("^user prepare batch request$")
  public void userPrepareBatchRequest() throws Throwable {

    batchAPI.prepare();
  }

}
