package com.future.function.qa.pages.scoring.Comparison;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.PaginationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.JUDGING_LIST_URL)
public class JudgingListPage extends PaginationPage {

  public WebElementFacade findJudgingDataList() {

    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
  }

  public WebElementFacade findJudgingData(int row) {

    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
        "/div[@class='main-content']/div[@class='auto-overflow-container']" +
        "/div[@class='judging-container']/div/div[%s]/div[1]", row)));
  }

  public WebElementFacade judgingDataTitle(int row) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[%s]/div[1]" +
        "/div[1]/div[1]/div[1]", row + 1)));
  }

  public WebElementFacade judgingDataDescription(int row) {
    return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]" +
        "/div[%s]/div[1]/div[1]/div[2]/div[1]/span[1]/p[1]", row + 1)));
  }

  public WebElementFacade addJudgingButton() {

    return find(By.xpath("//button[@class='button judging__action-add is-primary is-rounded']"));
  }

  public WebElementFacade findViewFinalScoreButton() {

    return find(By.xpath("//button[@class='button judging__action-view is-primary is-rounded']"));
  }

  public WebElementFacade findSelectBatchDropdown() {

    return find(By.xpath("//div[@class='judging__action level']//div[2]"));
  }
}
