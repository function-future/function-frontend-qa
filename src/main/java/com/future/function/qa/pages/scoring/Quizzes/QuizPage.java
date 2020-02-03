package com.future.function.qa.pages.scoring.Quizzes;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuizPage extends MenuPage {

    public WebElementFacade quizTimer() {
        return find(By.xpath("//progress[@class='progress is-large is-primary']"));
    }

    public WebElementFacade quizNavigationBar() {
        return find(By.xpath("//nav[@class='steps']"));
    }

    public WebElementFacade quizNavigationBarItem(int number) {
        return find(By.xpath(String.format("//div[@class='main-content']//li[%s]", number)));
    }

    public WebElementFacade quizNavigationBarMarker(int number) {
        return find(By.xpath(String.format("//li[%s]//a[1]//div[1]", number)));
    }

    public WebElementFacade questionText(int number) {
        return find(By.xpath(String.format("//div[@class='auto-overflow-container']//div[%s]//h1[1]", number)));
    }

    public WebElementFacade optionButton(int number, int row) {
        return find(By.xpath(String.format("//div[@class='b-steps']//div[%s]//div[%s]//div[1]//div[1]//label[1]", number, row)));
    }

    public WebElementFacade prevBtn() {
        return find(By.xpath("//button[@class='button quiz-questions__container__actions-prev is-danger is-outlined']"));
    }

    public WebElementFacade nextBtn() {
        return find(By.xpath("//button[@class='button is-success is-outlined']"));
    }

    public WebElementFacade submitBtn() {
        return find(By.xpath("//button[@class='button quiz-questions__container__actions-submit is-primary is-outlined']"));
    }

    public WebElementFacade finishQuizModal() {
        return find(By.xpath("//div[@class='modal__container']"));
    }

    public WebElementFacade trialsLeft() {
        return find(By.xpath("//div[@class='media-content']"));
    }

    public WebElementFacade totalScore() {
        return find(By.xpath("//div[@class='media-right']"));
    }

    public WebElementFacade retryBtn() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade finishBtn() {
        return find(By.xpath("//button[@class='button is-success']"));
    }

}
