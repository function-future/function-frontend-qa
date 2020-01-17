package com.future.function.qa.pages.core.Users;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CreateUserPage extends MenuPage {

    public WebElementFacade nameInput() {
        return find(By.xpath("//input[@name='name']"));
    }

    public WebElementFacade phoneInput() {
        return find(By.xpath("//input[@name='phone']"));
    }

    public WebElementFacade emailInput() {
        return find(By.xpath("//input[@name='email']"));
    }

    public WebElementFacade universityInput() {
        return find(By.xpath("//input[@name='university']"));
    }

    public WebElementFacade addressInput() {
        return find(By.xpath("//input[@name='address']"));
    }

    public WebElementFacade batchSelect() {
        return find(By.xpath("//select[@name='batch']"));
    }

    public WebElementFacade roleSelect() {
        return find(By.xpath("//select[@name='role']"));
    }

    public WebElementFacade saveButton() {
        return find(By.xpath("//div[@class='buttons']/button[2]"));
    }
}
