package com.future.function.qa.pages.scoring.Room;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class RoomDetailPage extends MenuPage {

    public WebElementFacade assignmentTitle() {
        return find(By.xpath("//div[@class='room-detail__container__header']"));
    }

    public WebElementFacade assignmentDescription() {
        return find(By.xpath("//div[@class='room-detail__container__content wrap-word']"));
    }

    public WebElementFacade discussionSection() {
        return find(By.xpath("//div[@class='collapse card room-detail__container__discussion']"));
    }

    public WebElementFacade discussionDropdown() {
        return find(By.xpath("//a[@class='card-header-icon']"));
    }

    public WebElementFacade discussions(String role) {
        int index = role.equals("MENTOR") ? 4 : 3;
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]" +
            "/div[%s]/div[2]", index)));
    }

    public WebElementFacade commentInput() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/article[1]" +
                "/div[1]/div[1]/p[1]/textarea[1]"));
    }

    public WebElementFacade postCommentBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade scoreSection() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]"));
    }

    public WebElementFacade scoreDetailSection() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]"));
    }

    public WebElementFacade scoreInput() {
        return find(By.xpath("//input[@placeholder='Score']"));
    }

    public WebElementFacade scoreDropdown() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]"));
    }

    public WebElementFacade scoreSubmitBtn() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/footer[1]/a[1]"));
    }

}
