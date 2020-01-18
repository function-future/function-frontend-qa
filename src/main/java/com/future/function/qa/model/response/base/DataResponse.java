package com.future.function.qa.model.response.base;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataResponse<T> extends BaseResponse {

  private T data;

  public DataResponse() {

  }

  @Builder
  private DataResponse(int code, String status, T data) {

    super(code, status);
    this.data = data;
  }
}
