package com.future.function.qa.pages.scoring.QuestionBanks;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuestionBankDetailPage extends MenuPage {

    public WebElementFacade editBtn() {
        return find(By.xpath("//button[@class='button is-primary is-rounded']"));
    }

    public WebElementFacade deleteBtn() {
        return find(By.xpath("//button[@class='button is-danger is-rounded']"));
    }

    public WebElementFacade addQuestionBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade bankTitle() {
        return find(By.xpath("//span[@class='is-size-5 has-text-weight-bold']"));
    }

    public WebElementFacade bankDescription() {
        return find(By.xpath("//div[@class='question-bank__container__content wrap-word']//span"));
    }

    public WebElementFacade questionDropdown() {
        return find(By.xpath("//div[@class='card-header']"));
    }

    public WebElementFacade questionList() {
        return find(By.xpath("//div[@id='contentIdForA11y3']"));
    }

    public WebElementFacade questionListItem(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[%s]/div[1]", row + 1 )));
    }

}
