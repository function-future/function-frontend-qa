package com.future.function.qa.pages.core.Batches;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.BATCHES_URL)
public class BatchesPage extends MenuPage {

    public WebElementFacade addButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
    }

    public WebElementFacade findBatchMoreButtonOnRow(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]", row)));
    }

    public WebElementFacade batchDropdownMenuOnRow(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]", row)));
    }

    public WebElementFacade batchEditButtonOnDropdownMenuOnRow(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]", row)));
    }

    public WebElementFacade batchDeleteButtonOnDropdownMenuOnRow(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[2]", row)));
    }
}
