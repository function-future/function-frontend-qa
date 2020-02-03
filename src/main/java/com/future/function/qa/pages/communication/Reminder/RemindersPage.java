package com.future.function.qa.pages.communication.Reminder;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.REMINDERS_URL)
public class RemindersPage extends MenuPage {

  public WebElementFacade createButton() {
    return find(By.xpath("//button[@class='button reminder__create-btn is-primary']"));
  }

  public WebElementFacade searchBar() {
    return find(By.xpath("//input[@placeholder='Search...']"));
  }

  public WebElementFacade reminderBox(int idx) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']/div[@class='main-content']/div[@class='reminder']/div[@class='reminder__body']/div[%s]", idx)));
  }

  public WebElementFacade deleteButton(int idx) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']/div[@class='main-content']/div[@class='reminder']/div[@class='reminder__body']/div[%s]/div[1]/*[2]", idx)));
  }
}
