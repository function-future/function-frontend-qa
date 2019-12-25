package com.future.function.qa.pages.core.Batches;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.BATCHES_URL)
public class BatchesPage extends MenuPage {

    public WebElementFacade addButton() {
        return find(By.xpath(""));
    }

}
