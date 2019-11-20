package com.future.function.qa.pages.base;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public abstract class PaginationPage extends MenuPage {

  public WebElementFacade findPageComponent() {

    return find(By.xpath("//nav[@class='pagination is-centered']"));
  }

}
