package com.future.function.qa.pages.core.StickyNotes;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.EDIT_STICKY_NOTES_URL)
public class EditStickyNotesPage extends MenuPage {

    public WebElementFacade titleInput() {
        return find(By.xpath("//input[@placeholder='Insert title here']"));
    }

    public WebElementFacade descriptionInput() {
        return find(By.xpath("//div[@class='ProseMirror']"));
    }

    public WebElementFacade submitButton() {
        return find(By.xpath("//button[@class='button is-primary']"));
    }

    public WebElementFacade cancelButton() {
        return find(By.xpath("//button[@class='button is-light']"));
    }
}
