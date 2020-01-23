package com.future.function.qa.pages.base;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public abstract class MenuPage extends BasePage {

  public WebElementFacade menuBar() {

    return find(By.xpath("//div[@class='menu navbar is-hidden-mobile is-hidden-touch']"));
  }

  public WebElementFacade comparisonsMenu(int menuIndex) {

    return find(By.xpath(String.format("//body//li[%s]", menuIndex)));
  }

  public WebElementFacade gradesMenu(int menuIndex) {

    return find(By.xpath(String.format("//body//li[%s]", menuIndex)));
  }

  public WebElementFacade findMenuWithIndex(int menuIndex) {

    return find(By.xpath(String.format("//body//li[%s]", menuIndex)));
  }

  public WebElementFacade navBar() {

    return find(By.xpath("//nav[@class='navbar is-primary is-spaced is-navbar is-hidden-mobile is-hidden-touch']"));
  }

  public WebElementFacade loginButton() {

    return find(By.xpath("//button[@class='button button is-light is-light is-outlined']"));
  }

  public WebElementFacade loginModal() {

    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade emailLoginInput() {

    return find(By.xpath("//input[@placeholder='Your email']"));
  }

  public WebElementFacade passwordLoginInput() {

    return find(By.xpath("//input[@placeholder='Your password']"));
  }

  public WebElementFacade loginModalButton() {

    return find(By.xpath("//button[@class='button is-primary is-fullwidth']"));
  }

  public WebElementFacade userBar() {

    return find(By.xpath("//div[@class='dropdown buttons is-bottom-left is-mobile-modal']"));
  }

  public WebElementFacade userDropdown() {

    return find(By.xpath("//div[@class='dropdown-menu']"));
  }

  public WebElementFacade logoutButton() {

    return find(By.xpath("//a[contains(text(),'Logout')]"));
  }

  public WebElementFacade exitLoginModalButton() {

    return find(By.xpath("//span[@class='close-button']"));
  }

}
