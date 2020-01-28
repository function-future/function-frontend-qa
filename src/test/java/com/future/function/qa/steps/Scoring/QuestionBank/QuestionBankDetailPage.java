package com.future.function.qa.steps.Scoring.QuestionBank;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuestionBankDetailPage extends MenuPage {

    WebElementFacade editBtn() {
        return find(By.xpath("//button[@class='button is-primary is-rounded']"));
    }

    WebElementFacade deleteBtn() {
        return find(By.xpath("//button[@class='button is-danger is-rounded']"));
    }

    WebElementFacade addQuestionBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    WebElementFacade bankTitle() {
        return find(By.xpath("//span[@class='is-size-5 has-text-weight-bold']"));
    }

    WebElementFacade bankDescription() {
        return find(By.xpath("//div[@class='question-bank__container__content wrap-word']//span"));
    }

    WebElementFacade questionDropdown() {
        return find(By.xpath("//div[@class='card-header']"));
    }

    WebElementFacade questionList() {
        return find(By.xpath("//div[@id='contentIdForA11y3']"));
    }

}
