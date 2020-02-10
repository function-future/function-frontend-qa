package com.future.function.qa.pages.communication.logging;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Author: RickyKennedy
 * Created At:12:41 AM 2/8/2020
 */

@DefaultUrl(UrlConstant.LOGGING_ROOM_DETAIL_URL)
public class LoggingRoomsDetailPage extends MenuPage {

  public WebElementFacade addTopicButton(){
    return find(By.xpath("//button[contains(@class,'button is-primary is-rounded add-btn submit')]"));
  }

  public WebElementFacade addTopicModal(){
    return find(By.xpath("//div[contains(@class,'modal__container')]"));
  }
  public WebElementFacade topicInput(){
    return find(By.xpath("//textarea[contains(@class,'textarea')]"));
  }

  public WebElementFacade topicSubmitButton(){
    return find(By.xpath("//span[contains(text(),'Submit')]"));
  }

  public WebElementFacade firstTopicCard(int idx) {
    return find(By.xpath(String.format(
      "//body/div[contains(@class,'app')]/div[contains(@class,'main-container is-fullhd')]/div[contains(@class,'main-content')]/div[contains(@class,'logging-room-detail')]/div[contains(@class,'logging-room-detail__container')]/div[contains(@class,'logging-room-detail__topic-list-container')]/div[contains(@class,'logging-room-detail__topic-list-container__content')]/div[contains(@class,'topic-card')]/div[%s]",idx)));
  }
}