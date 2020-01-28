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

    public WebElementFacade nameInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The name field is required.')]"));
    }

    public WebElementFacade phoneInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The phone field is required.')]"));
    }

    public WebElementFacade emailInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The email field is required.')]"));
    }

    public WebElementFacade universityInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The university field is required.')]"));
    }

    public WebElementFacade addressInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The address field is required.')]"));
    }

    public WebElementFacade batchSelectInputErrorMessage() {
        return find(By.xpath("//span[contains(text(),'The batch field is required.')]"));
    }
}
