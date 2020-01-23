package com.future.function.qa.pages.scoring.Comparison;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@NamedUrl(name = "batchCode", url = UrlConstant.JUDGING_DETAIL_URL)
public class JudgingDetailPage extends MenuPage {

  public WebElementFacade actionBar() {
    return find(By.xpath("//div[@class='judging-session__action']"));
  }

  public WebElementFacade titleLabel() {
    return find(By.xpath("//div[@class='judging-session__detail-header']"));
  }

  public WebElementFacade descriptionLabel() {
    return find(By.xpath("//div[@class='judging-session__detail-description']"));
  }

  public WebElementFacade batchLabel() {
    return find(By.xpath("//div[@class='judging-session__detail-batch']"));
  }

  public WebElementFacade studentList() {
    return find(By.xpath("//div[@class='judging-session__content level']"));
  }

  public WebElementFacade studentDetail(int index) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
        "/div[@class='main-content']/div[@class='auto-overflow-container']" +
        "/div[@class='judging-session__container']" +
        "/div[@class='judging-session__content level']/div[%s]", index)));
  }

  public int countStudentDetailList() {
    return studentList().findElements(By.cssSelector("div[class='level-item judging-session__content-item']")).size();
  }

  public WebElementFacade studentScoreDetail(int index) {
    return studentDetail(index).find(By.xpath(".//div[1]//div[2]"));
  }

  public WebElementFacade studentFinalScoreDetail(int index) {
    return studentDetail(index).find(By.xpath(".//div[1]//div[3]"));
  }

  public WebElement studentScoreDetailTabs(int studentIndex, int tabIndex) {
    return studentScoreDetail(studentIndex)
    .find(By.xpath(String.format("//div[@class='judging-session__container']" +
        "//div[1]//div[1]//div[2]//div[1]//nav[1]//ul[1]//li[%s]", tabIndex)));
  }

  public WebElementFacade studentFinalScoreDetailInput(int index) {
    if(index == 1) {
      return find(By.xpath("//div[@class='judging-session__container']//div[1]//div[1]//div[3]//div[1]//div[1]//input[1]"));
    } else if(index == 2) {
      return find(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[3]//div[1]//div[1]//input[1]"));
    }
    return null;
  }

  public WebElementFacade studentFinalScoreDetailButton(int index) {
    if(index == 1) {
      return find(By.xpath("//div[@class='judging-session__container']//div[1]" +
          "//div[1]//div[3]//div[1]//p[1]//button[1]"));
    } else if(index == 2) {
      return find(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[3]//div[1]//p[1]//button[1]"));
    }
    return null;
  }

}
