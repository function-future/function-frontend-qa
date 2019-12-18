package com.future.function.qa.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ModalDeleteConfirmation extends PageObject {

  public WebElementFacade confirmationDialog() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade confirmationText() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
  }

  public WebElementFacade deleteButton() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]"));
  }

}
