package com.future.function.qa.pages.base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public abstract class BasePage extends PageObject {

  public WebElementFacade toast() {

    return find(By.xpath("xpath"));
  }

}
