package com.future.function.qa.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ModalCreateFolder extends PageObject {

    public WebElementFacade modalDialog() {
        return find(By.xpath("//div[@class='modal__container']"));
    }

    public WebElementFacade createButton() {
        return find(By.xpath("//div[@class='modal__container']/div/button[2]"));
    }

    public WebElementFacade folderNameInput() {
        return find(By.xpath("//div[@class='modal__container']//input"));
    }
}
