package com.future.function.qa.pages.sanity;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.google.com")
public class SanityPage extends PageObject {

  public WebElementFacade findSearchBar() {

    return find(By.xpath("//input[@name='q']"));
  }
}
