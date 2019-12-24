package com.future.function.qa.model;

public interface UrlConstant {

  String HOME_URL = "http://localhost:10001";
  String ANNOUNCEMENTS_URL = "http://localhost:10001/announcements";
  String ANNOUNCEMENT_DETAIL_URL = "http://localhost:10001/announcements/{1}/detail";
  String EDIT_ANNOUNCEMENT_URL = "http://localhost:10001/announcements/{1}/edit";
  String CREATE_ANNOUNCEMENT_URL = "http://localhost:10001/announcements/add";
  String STICKY_NOTES_URL = "http://localhost:10001/sticky-notes";
  String EDIT_STICKY_NOTES_URL = "http://localhost:10001/sticky-notes/edit";
  String ACTIVITY_BLOGS_URL = "http://localhost:10001/activity-blogs";
  String JUDGING_LIST_URL = "https://localhost:10001/final-judgings";
  String ADD_JUDGING_URL = "http://localhost:10001/batches/{1}/final-judging/add";
  String JUDGING_DETAIL_URL = "http://localhost:10001/batches/{1}/final-judgings/{2}/detail";

}
