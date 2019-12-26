package com.future.function.qa.pages.core.Batches;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.CREATE_BATCH_URL)
public class CreateBatchPage extends MenuPage {

  public WebElementFacade codeInput() {
    return find(By.xpath("//input[@name='code']"));
  }

  public WebElementFacade nameInput() {
    return find(By.xpath("//input[@name='name']"));
  }

  public WebElementFacade saveButton() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[2]"));
  }

}
