package com.future.function.qa.model.request.core.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWebRequest {

  private String address;

  private List<String> avatar;

  private String batch;

  private String email;

  private String id;

  private String name;

  private String phone;

  private String role;

  private String university;
}

