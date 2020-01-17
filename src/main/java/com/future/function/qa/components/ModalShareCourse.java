package com.future.function.qa.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ModalShareCourse extends PageObject {

  public WebElementFacade modalDialog() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade shareButton() {
    return find(By.xpath("//button[@class='button modal__footer__button is-primary is-fullwidth']"));
  }

  public WebElementFacade cancelButton() {
    return find(By.xpath("//button[@class='button modal__footer__button is-primary is-fullwidth']"));
  }

  public WebElementFacade findBatchOnRow(int row) {
    return find(By.xpath(String.format("(//div[@class='modal__body']//div[contains(@class, 'columns is-mobile')])[%s]", row)));
  }

  public WebElementFacade findBatchRadioButtonOnRow(int row) {
    return find(By.xpath(String.format("((//div[@class='modal__body']//div[contains(@class, 'columns is-mobile')])[%s])//div[1]//label[1]//input[1]", row)));
  }

}
