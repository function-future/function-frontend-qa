package com.future.function.qa.pages.scoring.Assignment;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(value = "http://localhost:10001/batches/batchCode/assignments/assignmentId/detail")
public class AssignmentDetailPage extends MenuPage {

  public WebElementFacade assignmentTitle() {
    return find(By.xpath("//div[@class='assignment-detail__container__header-title']"));
  }

  public WebElementFacade assignmentDescription() {
    return find(By.xpath("//div[@class='assignment-detail__container__content wrap-word']"));
  }

  public WebElementFacade assignmentDeadline() {
    return find(By.xpath("//div[@class='assignment-detail__container__header__info']"));
  }

  public WebElementFacade viewRoomBtn() {
    return find(By.xpath("//button[@class='button is-pulled-right is-small is-primary is-rounded']"));
  }

  public WebElementFacade actionSection() {
    return find(By.xpath("//div[@class='assignment-detail__container__actions']"));
  }

  public WebElementFacade editBtn() {
    return find(By.xpath("//button[@class='button is-primary is-rounded']"));
  }

  public WebElementFacade deleteBtn() {
    return find(By.xpath("//button[@class='button is-danger is-rounded']"));
  }

  public WebElementFacade deleteModal() {
    return find(By.xpath("//div[@class='modal__container']"));
  }

  public WebElementFacade  deleteModalBody() {
    return find(By.xpath("//div[@class='modal__body']"));
  }

  public WebElementFacade cancelBtn() {
    return find(By.xpath("//button[@class='button modal__footer__button is-light is-fullwidth']"));
  }

  public WebElementFacade deleteConfirmBtn() {
    return find(By.xpath("//button[@class='button modal__footer__button is-danger is-fullwidth']"));
  }

  public WebElementFacade closeModalBtn() {
    return find(By.xpath("//span[@class='modal__close']"));
  }

}
