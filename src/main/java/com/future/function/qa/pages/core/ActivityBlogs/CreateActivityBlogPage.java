package com.future.function.qa.pages.core.ActivityBlogs;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.CREATE_ACTIVITY_BLOG_URL)
public class CreateActivityBlogPage extends MenuPage {

    public WebElementFacade titleInput() {
        return find(By.xpath("//input[@placeholder='Insert title here']"));
    }

    public WebElementFacade descriptionInput() {
        return find(By.xpath("//div[@class='ProseMirror']"));
    }

    public WebElementFacade saveButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[2]"));
    }

}
