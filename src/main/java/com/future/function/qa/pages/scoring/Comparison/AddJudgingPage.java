package com.future.function.qa.pages.scoring.Comparison;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;

@NamedUrl(name = "batchCode", url = UrlConstant.ADD_JUDGING_URL)
public class AddJudgingPage extends MenuPage {

  public WebElementFacade titleLabel() {
    return find(By.xpath("//label[@class='label']"));
  }

  public WebElementFacade titleInput() {
    return find(By.xpath("//input[@placeholder='Insert title here']"));
  }

  public WebElementFacade descriptionLabel() {
    return find(By.xpath("//div[@class='label']"));
  }

  public WebElementFacade descriptionInput() {
    return find(By.xpath("//div[@class='ProseMirror']"));
  }

  public WebElementFacade studentSelectionSection() {
    return find(By.xpath("//div[@class='judging-form__container-students']"));
  }

  public WebElementFacade addStudentButton() {
    return find(By.xpath("//div[@class='buttons is-right judging-form__container-students-add']//button[@class='button is-primary']"));
  }

  public WebElementFacade studentArrowButton() {
    return find(By.xpath("//a[@class='card-header-icon']//span[@class='icon']"));
  }

  public WebElementFacade studentSelectionModal() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade studentSelectList() {
    return find(By.xpath("//div[@class='modal__body']"));
  }

  public WebElementFacade studentDetail(int index) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
        "/div[@class='main-content']/div[@class='auto-overflow-container']" +
        "/div[@class='judging-form__container']/div[@class='judging-form__container-students']" +
        "/section/div[@class='collapse card']/div[@id='contentIdForA11y3']/div[@class='card-content']" +
        "/div[@class='content']/div[%s]", index)));
  }

  public WebElementFacade studentSelectDetail(int row) {
    return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
        "/div[@class='main-content']/div[@class='auto-overflow-container']/div[@class='modal__mask']" +
        "/div[@class='modal__wrapper']/div[@class='modal__container']/div[@class='modal__body']/div[%s]", row)));
  }

  public WebElementFacade studentSelectLabel() {
    return find(By.xpath("//h3[@class='modal__header__title']"));
  }

  public WebElementFacade exitStudentSelectionModalButton() {
    return find(By.xpath("//span[@class='modal__close']"));
  }

  public WebElementFacade cancelStudentSelectionButton() {
    return find(By.xpath("//button[@class='button modal__footer__button is-light is-fullwidth']"));
  }

  public WebElementFacade saveStudentSelectionModalButton() {
    return find(By.xpath("//button[@class='button modal__footer__button is-primary is-fullwidth']"));
  }

  public WebElementFacade studentSelectDetailCheckbox(int row) {
    if(row == 1) {
      return find(By.xpath(String.format("//div[@class='modal__container']//div[%s]//div[1]//label[1]//input[1]", row)));
    } else {
      return find(By.xpath(String.format("//div[@class='modal__body']//div[%s]//div[1]//label[1]//input[1]", row)));
    }
  }

  public WebElementFacade modalOverlay() {
    return find(By.xpath("//div[@class='modal__mask']"));
  }

  public WebElementFacade saveJudgingButton() {
    return find(By.xpath("//div[@class='buttons']//button[@class='button is-primary']"));
  }

}
