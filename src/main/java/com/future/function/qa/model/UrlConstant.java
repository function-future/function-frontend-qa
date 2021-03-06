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
  String CREATE_ACTIVITY_BLOG_URL = "http://localhost:10001/activity-blogs/add";
  String EDIT_ACTIVITY_BLOG_URL = "http://localhost:10001/activity-blogs/{1}/edit";
  String BATCHES_URL = "http://localhost:10001/batches";
  String CREATE_BATCH_URL = "http://localhost:10001/batches/add";
  String EDIT_BATCH_URL = "http://localhost:10001/batches/{1}/edit";
  String COURSES_URL = "http://localhost:10001/courses";
  String CREATE_COURSE_URL = "http://localhost:10001/courses/add";
  String JUDGING_LIST_URL = "https://localhost:10001/final-judgings";
  String ADD_JUDGING_URL = "http://localhost:10001/batches/{1}/final-judging/add";
  String JUDGING_DETAIL_URL = "http://localhost:10001/batches/{1}/final-judgings/{2}/detail";
  String SCORING_URL = "http://localhost:10001/scoring";
  String REMINDERS_URL = "http://localhost:10001/reminders";
  String REMINDER_CREATE_URL = "http://localhost:10001/reminders/create";
  String REMINDER_DETAIL_URL = "http://localhost:10001/reminders/{1}/detail";
  String REMINDER_EDIT_URL = "http://localhost:10001/reminders/{1}/edit";
  String ASSIGNMENT_DETAIL_URL = "http://localhost:10001/batches/batchCode/assignments/assignmentId/detail";
  String LOGGING_ROOMS_URL = "http://localhost:10001/logging-rooms";
  String LOGGING_ROOM_CREATE_URL = "http://localhost:10001/logging-rooms/_create";
  String LOGGING_ROOM_EDIT_URL = "http://localhost:10001/logging-rooms/edit";
  String LOGGING_ROOM_DETAIL_URL = "http://localhost:10001/logging-rooms/{1}";
  String LOGGING_ROOM_TOPIC_DETAIL_URL = "http://localhost:10001/logging-rooms/{1}/topics/{2}";
}
