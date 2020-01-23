package com.future.function.qa.pages.scoring.Landing;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.SCORING_URL)
public class GradesPage extends MenuPage {

    public WebElementFacade gradesTabs() {
        return find(By.xpath("//nav[@class='tabs']"));
    }

    public WebElementFacade gradesTabItem(int tabIdx) {
        return find(By.xpath(String.format("//div[@class='main-content']//li[%s]//a[1]", tabIdx + 1)));
    }

    public WebElementFacade gradesTabItemContent(int tabIdx) {
        return find(By.xpath(String.format("//div[@class='b-tabs scoring__header-tabs']//div[%s]//section[1]", tabIdx + 1)));
    }

    public WebElementFacade gradesTabItemContentData(int tabIdx, int row) {
        return find(By.xpath(String.format("//body/div[@class='app']" +
                "/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']" +
                "/div[@class='auto-overflow-container scoring-container']/section" +
                "/div[@class='b-tabs scoring__header-tabs']/section[@class='tab-content']" +
                "/div[%s]/section[1]/div[%s]", tabIdx + 1, row + 1)));
    }

    public WebElementFacade addGradesItemBtn(int tabIdx) {
        return find(By.xpath(String.format("//body/div[@class='app']" +
                "/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']" +
                "/div[@class='auto-overflow-container scoring-container']/section" +
                "/div[@class='b-tabs scoring__header-tabs']/section[@class='tab-content']" +
                "/div[%s]/div[1]/div[1]/div[1]/div[1]/button[1]", tabIdx + 1)));
    }

    public WebElementFacade findSelectBatchDropdown(int tabIdx) {
        return find(By.xpath(String.format("//body/div[@class='app']" +
                "/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']" +
                "/div[@class='auto-overflow-container scoring-container']/section" +
                "/div[@class='b-tabs scoring__header-tabs']/section[@class='tab-content']" +
                "/div[%s]/div[1]/div[1]/div[1]/div[1]/div[1]", tabIdx + 1)));
    }

    public WebElementFacade findGradesItemActionDropdownButton(int tabIdx, int row) {
        return find(By.xpath(String.format("//div[@class='b-tabs scoring__header-tabs']" +
                "//div[%s]//section[1]//div[1]" +
                "//div[%s]//div[1]//div[2]//div[1]//div[1]//button[1]", tabIdx + 1, row + 1)));
    }

    public WebElementFacade findPassedItemCheckbox(int tabIdx) {
        return find(By.xpath(String.format("//body/div[@class='app']" +
                "/div[@class='main-container is-fullhd']" +
                "/div[@class='main-content']" +
                "/div[@class='auto-overflow-container scoring-container']/section" +
                "/div[@class='b-tabs scoring__header-tabs']/section[@class='tab-content']" +
                "/div[%s]/div[1]/div[1]/div[1]/div[1]/div[1]", tabIdx + 1)));
    }

}
