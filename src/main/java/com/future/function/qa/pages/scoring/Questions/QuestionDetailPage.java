package com.future.function.qa.pages.scoring.Questions;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class QuestionDetailPage extends MenuPage {

    public WebElementFacade editBtn() {
        return find(By.xpath("//button[@class='button is-primary is-rounded']"));
    }

    public WebElementFacade deleteBtn() {
        return find(By.xpath("//button[@class='button is-danger is-rounded']"));
    }

    public WebElementFacade questionBox() {
        return find(By.xpath("//div[@class='question__container__header-title has-text-centered']//article[@class='tile is-child box']"));
    }

    public WebElementFacade optionBox(int row, int column) {
        return find(By.xpath(String.format("//div[@class='question__container']//div[%s]//div[%s]//article[1]", row + 1, column + 1)));
    }

}
