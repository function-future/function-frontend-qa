package com.future.function.qa.pages.core.Announcements;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;

@NamedUrl(name = "announcementId", url = UrlConstant.EDIT_ANNOUNCEMENT_URL)
public class EditAnnouncementPage extends MenuPage {

  public WebElementFacade titleInput() {
    return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
  }
}
