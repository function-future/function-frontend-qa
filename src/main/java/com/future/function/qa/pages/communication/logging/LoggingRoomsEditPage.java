package com.future.function.qa.pages.communication.logging;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Author: RickyKennedy
 * Created At:12:40 AM 2/8/2020
 */

@DefaultUrl(UrlConstant.LOGGING_ROOM_EDIT_URL)
public class LoggingRoomsEditPage extends MenuPage {

  public WebElementFacade titleInput() {
    return find(By.xpath("//input[@class='input']"));
  }

  public WebElementFacade descriptionInput() {
    return find(By.xpath("//textarea[@class='textarea']"));
  }

  public WebElementFacade saveButton(){
    return find(By.xpath("//button[contains(@class,'save-btn submit')]//span[@class='icon is-small']"));
  }


}
