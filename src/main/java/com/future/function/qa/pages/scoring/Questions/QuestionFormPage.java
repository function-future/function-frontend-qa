package com.future.function.qa.pages.scoring.Questions;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuestionFormPage extends MenuPage {

    public WebElementFacade titleBox() {
        return find(By.xpath("//div[@class='ProseMirror']"));
    }

    public WebElementFacade infoBox() {
        return find(By.xpath("//article[@class='message is-info is-small']"));
    }

    public WebElementFacade closeInfoBtn() {
        return find(By.xpath("//button[@class='delete']"));
    }

    public WebElementFacade optionSection(int index) {
        return find(By.xpath(String.format("//div[@class='question-form__container-options-detail']//div[%s]//div[1]//input[1]", index + 1)));
    }

    public WebElementFacade optionRadio(int index) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[%s]/label[2]/span[1]", index + 1)));
    }

    public WebElementFacade saveBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade cancelBtn() {
        return find(By.xpath("//button[@class='button is-light']"));
    }

}
