package com.future.function.qa.pages.scoring.Assignment;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:10001/batches/batchCode/assignments/add")
public class AddAssignmentPage extends MenuPage {

  public WebElementFacade assignmentTitleForm() {
    return find(By.xpath("//div[@class='assignment-form__container-title']//div[@class='field']"));
  }

  public WebElementFacade assignmentTitleInput() {
    return find(By.xpath("//div[@class='assignment-form__container-title']//div[@class='control is-clearfix']" +
        "//input[@placeholder='Insert title here']"));
  }

  public WebElementFacade assignmentDescriptionForm() {
    return find(By.xpath("//div[@class='assignment-form__container-title']//div[@class='control is-clearfix']"));
  }

  public WebElementFacade assignmentDescriptionInput() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]"));
  }

  public WebElementFacade assignmentDeadlineForm() {
    return find(By.xpath("//div[@class='assignment-form__container-date']"));
  }

  public WebElementFacade assignmentDeadlineInput() {
    return find(By.xpath("//div[@class='assignment-form__container-date']" +
        "//input[@placeholder='DD/MM/YYYY']"));
  }

  public WebElementFacade assignmentUploadForm() {
    return find(By.xpath("//div[@class='assignment-form__container-upload']"));
  }

  public WebElementFacade assignmentUploadInput() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/label[1]/input[1]"));
  }

  public WebElementFacade actionSection() {
    return find(By.xpath("//div[@class='assignment-form__container-actions']"));
  }

  public WebElementFacade saveBtn() {
    return find(By.xpath("//div[@class='assignment-form__container-actions']//div[@class='buttons']" +
        "//button[@class='button is-primary']"));
  }

  public WebElementFacade cancelBtn() {
    return find(By.xpath("//div[@class='assignment-form__container-actions']//div[@class='buttons']" +
        "//button[@class='button is-light']"));
  }

}
