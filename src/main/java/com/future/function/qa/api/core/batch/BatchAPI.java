package com.future.function.qa.api.core.batch;

import com.future.function.qa.api.BaseAPI;
import com.future.function.qa.model.request.core.batch.BatchWebRequest;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import java.util.function.Supplier;

import static com.future.function.qa.util.Path.BATCH;

public class BatchAPI extends BaseAPI {

  @Step
  public Response create(BatchWebRequest request, Cookie cookie) {

    return doByCookiePresent(cookie, createBatchWithCookie(request, cookie), createBatchWithoutCookie(request));
  }

  private Supplier<Response> createBatchWithCookie(BatchWebRequest request, Cookie cookie) {

    return () -> base.body(request)
        .contentType(ContentType.JSON)
        .cookie(cookie)
        .post();
  }

  private Supplier<Response> createBatchWithoutCookie(BatchWebRequest request) {

    return () -> base.body(request)
        .contentType(ContentType.JSON)
        .post();
  }

  @Step
  public Response delete(String id, Cookie cookie) {

    return doByCookiePresent(cookie, deleteBatchWithCookie(id, cookie), deleteBatchWithoutCookie(id));
  }

  private Supplier<Response> deleteBatchWithCookie(String id, Cookie cookie) {

    return () -> base.cookie(cookie)
        .delete(String.format(PATH_ID, id));
  }

  private Supplier<Response> deleteBatchWithoutCookie(String id) {

    return () -> base.delete(String.format(PATH_ID, id));
  }

  @Step
  @Override
  public RequestSpecification prepare() {

    base = super.prepare()
        .basePath(BATCH);

    return base;
  }
}
