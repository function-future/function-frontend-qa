package com.future.function.qa.pages.errors.general;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ToastComponent extends PageObject {

  public WebElementFacade toastDanger() {
    return find(By.xpath("//div[@class='toasted toaster bubble error']"));
  }

}
