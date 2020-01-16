package com.future.function.qa.pages.core.Courses;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.COURSES_URL)
public class CoursesPage extends MenuPage {

  public WebElementFacade addButton() {
    return find(By.xpath("//div[@class='b-tabs']//div[1]//div[1]//div[1]//div[2]//div[1]//button[1]"));
  }

  public WebElementFacade coursesTabs(int index) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[%s]", index)));
  }

  public WebElementFacade findMasterCourseOrCourseOnTabIndexOnRow(int tabIndex, int row) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[1]/div[1]/div[1]/section[1]/div[%s]/div[2]/div[%s]", tabIndex, row)));
  }

  public WebElementFacade findMasterCourseOrCourseMoreButtonOnTabIndexOnRow(int tabIndex, int row) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[1]/div[1]/div[1]/section[1]/div[%s]/div[2]/div[%s]" +
            "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]", tabIndex, row)));
  }

  public WebElementFacade findMasterCourseOrCourseDropdownActionOnTabIndexOnRow(int tabIndex, int row) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[1]/div[1]/div[1]/section[1]/div[%s]/div[2]/div[%s]" +
            "/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]", tabIndex, row)));
  }

  public WebElementFacade findActionOnMasterCourseOrCourseDropdownOnTabIndexOnRowOnIndex(int tabIndex, int row, int index) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[1]/div[1]/div[1]/section[1]/div[%s]/div[2]/div[%s]" +
            "/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[%s]", tabIndex, row, index)));
  }

  public WebElementFacade findMasterCourseOrCourseTitleOnTabIndexOnRow(int tabIndex, int row) {
    return find(By.xpath(String.format("(/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[1]/div[1]/div[1]/section[1]/div[%s]/div[2]" +
            "//div[contains(@class, 'list-container__content-header-title has-text-weight-bold')])[%s]", tabIndex, row)));
  }

}
