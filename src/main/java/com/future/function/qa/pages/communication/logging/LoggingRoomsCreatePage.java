package com.future.function.qa.pages.communication.logging;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Author: RickyKennedy
 * Created At:12:27 AM 2/8/2020
 */
@DefaultUrl(UrlConstant.LOGGING_ROOM_CREATE_URL)
public class LoggingRoomsCreatePage extends MenuPage {

  public WebElementFacade titleInput() {
    return find(By.xpath("//input[@class='input']"));
  }

  public WebElementFacade descriptionInput(){
    return find(By.xpath("//textarea[@class='textarea']"));
  }

  public WebElementFacade addMemberButton() {
    return find(By.xpath("//button[contains(@class,'add-btn submit')]"));
  }

  public WebElementFacade addMemberModal() {
    return find(By.xpath("//div[contains(@class,'modal__container')]"));
  }


  public WebElementFacade memberCardOnModal() {
    return find(By.xpath("//div[contains(@class,'box is-marginless user-list-card__container modal__body__card')]"));
  }

  public WebElementFacade closeButtonAddMemberModal() {
    return find(By.xpath("//span[contains(@class,'modal__close')]"));
  }

  public WebElementFacade saveButton() {
    return find(By.xpath("//button[contains(@class,'save-btn submit')]"));
  }

}
