package com.future.function.qa.pages.core.Users;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class UsersPage extends MenuPage {

    public WebElementFacade addButton(int index) {
        return find(By.xpath(String.format("//div[@class='b-tabs']/section[@class='tab-content']/div[%s]/div/button[1]", index)));
    }

    public WebElementFacade usersTabs(int index) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[%s]", index)));
    }

    public WebElementFacade usersTabName(int index) {
        return find(By.xpath(String.format("(//div[@class='main-content']//li/a/span)[%s]", index)));
    }
}
