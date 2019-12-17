package com.future.function.qa.pages.core.Announcements;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;

@NamedUrl(name = "announcementId", url = UrlConstant.ANNOUNCEMENT_DETAIL_URL)
public class AnnouncementDetailPage extends MenuPage {

    public WebElementFacade title() {
        return find(By.xpath("//span[@class='is-size-5 has-text-weight-bold']"));
    }

}
