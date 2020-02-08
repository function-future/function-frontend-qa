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

@DefaultUrl(UrlConstant.LOGGING_ROOM_TOPIC_DETAIL_URL)
public class LoggingRoomTopicDetailPage extends MenuPage {

  public WebElementFacade logInput(){
    return find(By.xpath("//input[@placeholder='Type a message']"));
  }

  public WebElementFacade sendButton() {
    return find(By.xpath("//div[@class='log-message__input-bar__btn-send']"));
  }

}
