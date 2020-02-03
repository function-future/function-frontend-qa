package com.future.function.qa.pages.scoring.Quizzes;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuizFormPage extends MenuPage {

    public WebElementFacade quizTitleInput() {
        return find(By.xpath("//input[@placeholder='Insert title here']"));
    }

    public WebElementFacade quizDescriptionInput() {
        return find(By.xpath("//div[@class='ProseMirror']"));
    }

    public WebElementFacade dateBox() {
        return find(By.xpath("//div[@class='dropdown is-mobile-modal']"));
    }

    public WebElementFacade calendar() {
        return find(By.xpath("//div[@class='dropdown is-active is-mobile-modal']//div[@class='dropdown-content']"));
    }

    public WebElementFacade calendarWeek(int row) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container']/div[@class='quiz-form__container']" +
                "/div[@class='quiz-form__container-details']/div[@class='quiz-form__container-details__date']" +
                "/div[@class='quiz-form__container-details-input']/div[@class='field is-floating-label']" +
                "/div[@class='datepicker control']/div[@class='dropdown is-active is-mobile-modal']" +
                "/div[@class='dropdown-menu']/div[@class='dropdown-content']/div[@class='dropdown-item']" +
                "/div[@class='datepicker-content']/section[@class='datepicker-table']" +
                "/div[@class='datepicker-body']/div[%s]", row + 1)));
    }

    public WebElementFacade calendarDate(int row, int col) {
        return find(By.xpath(String.format("//div[@class='main-content']//div[%s]//a[%s]", row + 1, col + 1)));
    }

    public WebElementFacade detailBox(int col) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']/div[@class='main-content']" +
                "/div[@class='auto-overflow-container']/div[@class='quiz-form__container']" +
                "/div[@class='quiz-form__container-details']/div[%s]/div[1]", col + 1)));
    }

    public WebElementFacade detailInputBox(int col) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]" +
                "/div[%s]/div[1]/div[1]/div[1]/input[1]", col + 1)));
    }

    public WebElementFacade questionBankSection() {
        return find(By.xpath("//div[@class='quiz-form__container-students']//section"));
    }

    public WebElementFacade toggleQuestionBankList() {
        return find(By.xpath("//a[@class='card-header-icon']"));
    }

    public WebElementFacade questionBankList() {
        return find(By.xpath("//div[@id='contentIdForA11y3']"));
    }

    public WebElementFacade questionBankListItem(int row) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container']/div[@class='quiz-form__container']" +
                "/div[@class='quiz-form__container-students']/section/div[@class='collapse card']" +
                "/div[@id='contentIdForA11y3']/div[@class='card-content']" +
                "/div[@class='content']/div/div[%s]", row)));
    }

    public WebElementFacade addQuestionBtn() {
        return find(By.xpath("//div[@class='buttons is-right quiz-form__container-students-add']//button[@class='button is-primary']"));
    }

    public WebElementFacade removeQuestionBtn(int row) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container']" +
                "/div[@class='quiz-form__container']/div[@class='quiz-form__container-students']/section" +
                "/div[@class='collapse card']/div[@id='contentIdForA11y3']/div[@class='card-content']" +
                "/div[@class='content']/div/div/div[@class='list-wrapper']/div[@class='list-container']" +
                "/div[@class='list-container__actions']/div[@class='card-content-action']/span[%s]", row + 1)));
    }

    public WebElementFacade cancelBtn() {
        return find(By.xpath("//button[@class='button is-light']"));
    }

    public WebElementFacade saveBtn() {
        return find(By.xpath("//div[@class='buttons']//button[@class='button is-primary']"));
    }

    public WebElementFacade questionBankModal() {
        return find(By.xpath("//div[@class='modal__container']"));
    }

    public WebElementFacade questionBankModalItem(int row) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container']/div[@class='modal__mask']" +
                "/div[@class='modal__wrapper']/div[@class='modal__container']/div[@class='modal__body']/div[%s]", row + 1)));
    }

    public WebElementFacade questionBankModalCheckbox(int row) {
        return find(By.xpath(String.format("//body/div[@class='app']/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']/div[@class='auto-overflow-container']/div[@class='modal__mask']" +
                "/div[@class='modal__wrapper']/div[@class='modal__container']" +
                "/div[@class='modal__body']/div[%s]/div[1]", row + 1)));
    }

    public WebElementFacade questionBankModalCancel() {
        return find(By.xpath("//button[@class='button modal__footer__button is-light is-fullwidth']"));
    }

    public WebElementFacade questionBankModalSave() {
        return find(By.xpath("//button[@class='button modal__footer__button is-primary is-fullwidth']"));
    }

    public WebElementFacade questionBankModalClose() {
        return find(By.xpath("//span[@class='modal__close']"));
    }

}
