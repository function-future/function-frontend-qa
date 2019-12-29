package com.future.function.qa.pages.core.Courses;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CourseDetailPage extends MasterCourseDetailPage {

    public WebElementFacade discussionSection() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]"));
    }

    public WebElementFacade editButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
    }

    public WebElementFacade deleteButton() {
        return find(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]"));
    }

    public WebElementFacade discussionInput() {
        return find(By.xpath("//textarea[@placeholder='Start a discussion...']"));
    }

    public WebElementFacade postDiscussionButton() {
        return find(By.xpath("//article/div/div[contains(@class, 'field has-text-right')]/button"));
    }

    public WebElementFacade findDiscussionOnRow(int row) {
        return find(By.xpath(String.format("(//article/div/div[contains(@class, 'content')])[%s]", row)));
    }

    public WebElementFacade findDiscussionTextOnRow(int row) {
        return find(By.xpath(String.format("(//article/div/div[contains(@class, 'content')])[%s]/div[contains(@class, 'course-detail__container__discussion__list-content')]", row)));
    }
}
