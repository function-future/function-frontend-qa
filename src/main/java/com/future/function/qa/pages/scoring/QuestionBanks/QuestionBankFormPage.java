package com.future.function.qa.pages.scoring.QuestionBanks;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuestionBankFormPage extends MenuPage {

    public WebElementFacade titleInput() {
        return find(By.xpath("//input[@placeholder='Insert title here']"));
    }

    public WebElementFacade descriptionInput() {
        return find(By.xpath("//div[@class='ProseMirror']"));
    }

    public WebElementFacade saveBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade cancelBtn() {
        return find(By.xpath("//button[@class='button is-light']"));
    }

}
