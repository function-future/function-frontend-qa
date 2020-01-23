package com.future.function.qa.pages.core.Files;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class FilesPage extends MenuPage {

    public WebElementFacade createFolderButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]"));
    }

    public WebElementFacade addFileButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"));
    }

}
