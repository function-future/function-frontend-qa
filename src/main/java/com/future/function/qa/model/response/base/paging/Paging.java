package com.future.function.qa.model.response.base.paging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paging {

  private long page;

  private long size;

  private long totalRecords;
}
