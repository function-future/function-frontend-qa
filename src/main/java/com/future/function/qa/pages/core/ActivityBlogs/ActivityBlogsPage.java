package com.future.function.qa.pages.core.ActivityBlogs;

import com.future.function.qa.model.UrlConstant;
import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(UrlConstant.ACTIVITY_BLOGS_URL)
public class ActivityBlogsPage extends MenuPage {

    public WebElementFacade findActivityBlog(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]", row)));
    }

    public WebElementFacade findActivityBlogMoreButton(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[2]/div[1]/div[1]/button[1]", row)));
    }

    public WebElementFacade findActivityBlogActionDropdown(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[2]/div[1]/div[3]", row)));
    }

    public WebElementFacade findDeleteButtonOnActionDropdown(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[2]/div[1]/div[3]/div[1]/a[2]", row)));
    }

    public WebElementFacade findEditButtonOnActionDropdown(int row) {
        return find(By.xpath(String.format("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[%s]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]", row)));
    }
}
