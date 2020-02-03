package com.future.function.qa.pages.communication.Reminder;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.REMINDER_DETAIL_URL)
public class ReminderDetailPage extends MenuPage {

  public WebElementFacade editButton() {
    return find(By.xpath("//button[@class='button reminder-form__edit-btn is-primary is-medium']"));
  }

}
