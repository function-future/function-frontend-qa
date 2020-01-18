package com.future.function.qa.data.core.batch;

import com.fasterxml.jackson.core.type.TypeReference;
import com.future.function.qa.data.BaseData;
import com.future.function.qa.model.request.core.batch.BatchWebRequest;
import com.future.function.qa.model.response.base.DataResponse;
import com.future.function.qa.model.response.base.PagingResponse;
import com.future.function.qa.model.response.core.batch.BatchWebResponse;
import io.restassured.response.Response;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BatchData extends BaseData {

  private PagingResponse<BatchWebResponse> pagedResponse = new PagingResponse<>();

  private BatchWebRequest request;

  private DataResponse<BatchWebResponse> singleResponse = new DataResponse<>();

  public BatchWebRequest createRequest(String id, String name, String code) {

    request = BatchWebRequest.builder()
        .name(name)
        .code(code)
        .build();

    if (id != null) {
      request.setId(id);
    }

    return request;
  }

  @Override
  public void setResponse(Response response) {

    super.setResponse(response);
    this.pagedResponse = asPagingResponse(response, new TypeReference<PagingResponse<BatchWebResponse>>() {});
    this.singleResponse = asDataResponse(response, new TypeReference<DataResponse<BatchWebResponse>>() {});
  }
}
