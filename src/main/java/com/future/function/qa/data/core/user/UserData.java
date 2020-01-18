package com.future.function.qa.data.core.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.future.function.qa.data.BaseData;
import com.future.function.qa.model.request.core.user.UserWebRequest;
import com.future.function.qa.model.response.base.DataResponse;
import com.future.function.qa.model.response.base.PagingResponse;
import com.future.function.qa.model.response.core.user.UserWebResponse;
import io.restassured.response.Response;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Collections;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserData extends BaseData {

  private String targetUserId;

  private DataResponse<UserWebResponse> createdResponse = new DataResponse<>();

  private UserWebRequest request;

  private DataResponse<UserWebResponse> retrievedResponse = new DataResponse<>();

  private PagingResponse<UserWebResponse> pagingResponse = new PagingResponse<>();

  public UserWebRequest createRequest(String id, String email, String name, String role, String address, String phone,
                                      String avatar, String batchCode, String university) {

    request = UserWebRequest.builder()
        .email(email)
        .name(name)
        .role(role)
        .address(address)
        .phone(phone)
        .build();

    if (!StringUtils.isEmpty(id)) {
      request.setId(id);
    }

    if (!StringUtils.isEmpty(avatar)) {
      request.setAvatar(Collections.singletonList(avatar));
    }

    if (!StringUtils.isEmpty(batchCode)) {
      request.setBatch(batchCode);
    }

    if (!StringUtils.isEmpty(university)) {
      request.setUniversity(university);
    }

    return request;
  }

  @Override
  public void setResponse(Response response) {

    super.setResponse(response);
    this.createdResponse = asDataResponse(response, new TypeReference<DataResponse<UserWebResponse>>() {});
    this.retrievedResponse = asDataResponse(response, new TypeReference<DataResponse<UserWebResponse>>() {});
    this.pagingResponse = asPagingResponse(response, new TypeReference<PagingResponse<UserWebResponse>>() {});
  }
}
