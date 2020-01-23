package com.future.function.qa.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ModalDeleteConfirmation extends PageObject {

  public WebElementFacade confirmationDialog() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade deleteButton() {
    return find(By.xpath("//button[@class='button modal__footer__button is-danger is-fullwidth']"));
  }

}
