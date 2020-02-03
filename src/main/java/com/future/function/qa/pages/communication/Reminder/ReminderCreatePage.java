package com.future.function.qa.pages.communication.Reminder;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.REMINDER_CREATE_URL)
public class ReminderCreatePage extends MenuPage {

  public WebElementFacade saveButton() {
    return find(By.xpath("//button[@class='button reminder-form__edit-btn is-primary is-medium']"));
  }

  public WebElementFacade titleInput() {
    return find(By.xpath("//input[@class='input is-medium']"));
  }

  public WebElementFacade descriptionInput() {
    return find(By.xpath("//textarea[@class='textarea is-medium']"));
  }

  public WebElementFacade addMemberButton() {
    return find(By.xpath("//button[@class='button is-rounded is-primary create-button reminder-form__add-member-btn is-small submit']"));
  }

  public WebElementFacade addMemberModal() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade memberModalCard(int idx) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']/div[@class='main-content']/div[@class='reminder-form__container']/div[@class='reminder-form__detail']/div[@class='modal__mask']/div[@class='modal__wrapper']/div[@class='modal__container']/div[@class='modal__body']/div[@class='modal__user-list']/div[%s]", idx)));
  }

  public WebElementFacade memberModalSearch() {
    return find(By.xpath("//input[@placeholder='Search...']"));
  }

  public WebElementFacade member(int idx) {
    return find(By.xpath(String.format("//div[@class='reminder-form__member']//div[%s]", idx)));
  }

}
