package com.future.function.qa.pages.errors.scoring;

import com.future.function.qa.model.UrlConstant;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;

@NamedUrl(name = "batchCode", url = UrlConstant.ADD_JUDGING_URL)
public class AddJudgingPageErrors extends PageObject{

  public WebElementFacade titleErrorLabel() {
    return find(By.xpath("//span[contains(text(),'The title field is required.')]"));
  }

  public WebElementFacade descriptionErrorLabel() {
    return find(By.xpath("//span[contains(text(),'The description field is required.')]"));
  }

}
