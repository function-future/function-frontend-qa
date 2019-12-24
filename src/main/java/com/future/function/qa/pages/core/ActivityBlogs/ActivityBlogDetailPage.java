package com.future.function.qa.pages.core.ActivityBlogs;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ActivityBlogDetailPage extends MenuPage {

    public WebElementFacade title() {
        return find(By.xpath("//span[@class='is-size-5 has-text-weight-bold']"));
    }

    public WebElementFacade description() {
        return find(By.xpath("//span[@class='content']"));
    }

    public WebElementFacade deleteButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]"));
    }

    public WebElementFacade editButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
    }

}
