package com.future.function.qa.pages.scoring.Room;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class RoomListPage extends MenuPage {

    public WebElementFacade paginationSection() {
        return find(By.xpath("//nav[@class='pagination is-centered']"));
    }

    public WebElementFacade roomListItem(int itemIdx) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container'" +
                "]/div[@class='card-container']/div[%s]", itemIdx)));
    }

    public WebElementFacade roomDetailBtn(int itemIdx) {
        return roomListItem(itemIdx).find(By.tagName("footer")).find(By.tagName("button"));
    }

    public WebElementFacade roomDetailImage(int itemIdx) {
        return roomListItem(itemIdx).find(By.className("card-image"));
    }

    public WebElementFacade roomDetailName(int itemIdx) {
        return roomListItem(itemIdx).find(By.className("card-content")).find(By.className("media"))
                .find(By.className("media-content")).find(By.className("title"));
    }

    public WebElementFacade roomDetailUniversity(int itemIdx) {
        return roomListItem(itemIdx).find(By.className("card-content")).find(By.className("media"))
                .find(By.className("media-content")).find(By.className("subtitle"));
    }

    public WebElementFacade roomListSection() {
        return find(By.xpath("//div[@class='card-container']"));
    }

}
