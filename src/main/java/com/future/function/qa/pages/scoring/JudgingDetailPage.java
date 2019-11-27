package com.future.function.qa.pages.scoring;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;

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

}
