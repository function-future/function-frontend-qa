package com.future.function.qa.data.core.resource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.future.function.qa.data.BaseData;
import com.future.function.qa.model.response.base.DataResponse;
import com.future.function.qa.model.response.core.resource.FileContentWebResponse;
import io.restassured.response.Response;
import lombok.*;
import org.springframework.stereotype.Component;

import java.io.File;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResourceData extends BaseData {

  private byte[] bytes;

  private DataResponse<FileContentWebResponse> createdResponse = new DataResponse<>();

  private File file;

  private String origin;

  public void createRequest(String filePath, String origin) {

    this.file = new File(filePath);
    this.origin = origin;
  }

  @Override
  public void setResponse(Response response) {

    super.setResponse(response);
    this.createdResponse = asDataResponse(response, new TypeReference<DataResponse<FileContentWebResponse>>() {});
    this.bytes = asBytes(response);
  }

  private byte[] asBytes(Response response) {

    return response.body()
        .asByteArray();
  }
}
