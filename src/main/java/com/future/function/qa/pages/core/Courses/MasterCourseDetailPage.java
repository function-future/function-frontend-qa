package com.future.function.qa.pages.core.Courses;

import com.future.function.qa.pages.base.MenuPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class MasterCourseDetailPage extends MenuPage {

    public WebElementFacade title() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]"));
    }

}
