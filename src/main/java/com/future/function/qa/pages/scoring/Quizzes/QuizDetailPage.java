package com.future.function.qa.pages.scoring.Quizzes;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuizDetailPage extends MenuPage {

    public WebElementFacade editBtn() {
        return find(By.xpath("//button[@class='button is-primary is-rounded']"));
    }

    public WebElementFacade deleteBtn() {
        return find(By.xpath("//button[@class='button is-danger is-rounded']"));
    }

    public WebElementFacade quizTitle() {
        return find(By.xpath("//div[@class='quiz-detail__container__header-title']"));
    }

    public WebElementFacade quizDescription() {
        return find(By.xpath("//p[contains(text(),'Description')]"));
    }

    public WebElementFacade quizDetailBox(int col) {
        return find(By.xpath(String.format("//div[@class='tile is-ancestor']//div[%s]", col + 1)));
    }

    public WebElementFacade detailBoxHeader(int col) {
        return find(By.xpath(String.format("//div[@class='tile is-ancestor']//div[%s]//article[1]", col + 1)));
    }

    public WebElementFacade questionBankSection() {
        return find(By.xpath("//div[@class='collapse card']"));
    }

    public WebElementFacade questionBankList() {
        return find(By.xpath("//div[@id='contentIdForA11y3']"));
    }

    public WebElementFacade expandQuestionBankList() {
        return find(By.xpath("//a[@class='card-header-icon']"));
    }

    public WebElementFacade startBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade deleteQuizModal() {
        return find(By.xpath("//div[@class='modal__container']"));
    }

    public WebElementFacade deleteModalCloseButton() {
        return find(By.xpath("//span[@class='icon lg']"));
    }

    public WebElementFacade deleteModalCancelBtn() {
        return find(By.xpath("//button[@class='button modal__footer__button is-light is-fullwidth']"));
    }

    public WebElementFacade deleteModalConfirmBtn() {
        return find(By.xpath("//button[@class='button modal__footer__button is-danger is-fullwidth']"));
    }

}
