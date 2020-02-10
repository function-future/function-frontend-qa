package com.future.function.qa.pages.communication.logging;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Author: RickyKennedy
 * Created At:12:15 AM 2/8/2020
 */

@DefaultUrl(UrlConstant.LOGGING_ROOMS_URL)
public class LoggingRoomsPage extends MenuPage {

  public WebElementFacade addButton(){
    return find(By.xpath("//button[@class='button is-rounded is-primary add-button submit is-rounded']"));
  }

  public WebElementFacade firstLoggingRoomCard(){
    return find(By.xpath("//div[@class='logging-room-card__outer']"));
  }

  public WebElementFacade loggingRoomFirstTitle(){
    return find(By.xpath("//div[contains(@class,'logging-room-card__title')]"));
  }

  public WebElementFacade loggingRoomFirstDescription(){
    return find(By.xpath("//div[contains(@class,'logging-room-card__description')]"));
  }

  public WebElementFacade editButtonFirstLoggingRoomCard(){
    return find(By.xpath("//*[@class='icon icon-edit svg-inline--fa fa-edit fa-w-18']"));
  }

}
