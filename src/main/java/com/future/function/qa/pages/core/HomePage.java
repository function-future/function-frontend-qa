package com.future.function.qa.pages.core;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.awt.peer.TextComponentPeer;

@DefaultUrl(UrlConstant.HOME_URL)
public class HomePage extends MenuPage {

    public WebElementFacade stickyNotes() {
        return find(By.xpath("//div[@class='card-content is-flex']"));
    }

    public WebElementFacade announcementList() {
        return find(By.xpath("//div[@class='announcements']"));
    }

    public WebElementFacade announcementText() {
        return find(By.xpath("//div[@class='announcements__title is-size-5']//span[contains(text(),'Announcements')]"));
    }

    public WebElementFacade findAnnouncement(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[%s]", row)));
    }

    public WebElementFacade findAnnouncementTitle(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[%s]" +
                "/div[1]/div[1]/div[1]/div[1]", row)));
    }

    public WebElementFacade stickyNotesTitle() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
    }
}
