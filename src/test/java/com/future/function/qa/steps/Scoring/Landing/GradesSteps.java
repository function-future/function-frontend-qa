package com.future.function.qa.steps.Scoring.Landing;

import com.future.function.qa.pages.core.HomePage;
import com.future.function.qa.pages.scoring.Landing.GradesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GradesSteps {

    private GradesPage gradesPage;

    private HomePage homePage;

    @And("^user should not see grades menu with index (\\d+)$")
    public void userShouldNotSeeGradesMenu(int menuIndex) {
        homePage.gradesMenu(menuIndex).shouldNotBePresent();
    }

    @When("^user should see grades menu with index (\\d+)$")
    public void userSeeGradesMenu(int menuIndex) {
        homePage.gradesMenu(menuIndex).shouldBeVisible();
    }

    @When("^user click grades menu with index (\\d+)$")
    public void userClickGradesMenu(int menuIndex) {
        homePage.gradesMenu(menuIndex).click();
    }

    @Then("^user should be in grades page$")
    public void userShouldBeInScoringLandingPage() {
        gradesPage.shouldBeDisplayed();
    }

    @And("^user should see grades tabs$")
    public void userShouldSeeGradesTabs() {
        gradesPage.gradesTabs().shouldBeVisible();
    }

    @And("^user clicks on the grades tab with index (\\d+)$")
    public void userClicksOnTheGradesTabWithIndex(int tabItem) {
        gradesPage.gradesTabItem(tabItem).click();
    }

    @Then("^user should see grades tab list item with index (\\d+) in grades menu$")
    public void userShouldSeeGradesTabListItemWithIndexInGradesMenu(int tabIdx) {
        gradesPage.gradesTabItemContent(tabIdx).shouldBeVisible();
    }

    @And("^user should see tab (\\d+) content with index (\\d+)$")
    public void userShouldSeeTabContentWithIndex(int tabIdx, int row) {
        gradesPage.gradesTabItemContentData(tabIdx, row).shouldBeVisible();
    }

    @And("^user should see add button on tab (\\d+)$")
    public void userShouldSeeAddButtonOnTab(int tabIdx) {
        gradesPage.addGradesItemBtn(tabIdx).shouldBeVisible();
    }

    @And("^user should not see add button on tab (\\d+)$")
    public void userShouldNotSeeAddButtonOnTab(int tabIdx) {
        gradesPage.addGradesItemBtn(tabIdx).shouldNotBeVisible();
    }

    @And("^user should see action dropdown button on tab (\\d+) item with index (\\d+)$")
    public void userShouldSeeAssignmentActionDropdownButtonOnTabItemWithIndex(int tabIdx, int row) {
        gradesPage.findGradesItemActionDropdownButton(tabIdx, row).shouldBeVisible();
    }

    @And("^user should not see action dropdown button on tab (\\d+) item with index (\\d+)$")
    public void userShouldNotSeeAssignmentActionDropdownButtonOnTabItemWithIndex(int tabIdx, int row) {
        gradesPage.findGradesItemActionDropdownButton(tabIdx, row).shouldNotBeVisible();
    }

    @And("^user should see passed item checkbox on tab (\\d+)$")
    public void userShouldSeePassedItemCheckboxOnTab(int tabIdx) {
        gradesPage.findPassedItemCheckbox(tabIdx).shouldBeVisible();
    }

    @And("^user should see batch selection dropdown on tab (\\d+)$")
    public void userShouldSeeBatchSelectionDropdownOnTab(int tabIdx) {
        gradesPage.findSelectBatchDropdown(tabIdx).shouldBeVisible();
    }

    @And("^user should not see batch selection dropdown on tab (\\d+)$")
    public void userShouldNotSeeBatchSelectionDropdownOnTab(int tabIdx) {
        gradesPage.findSelectBatchDropdown(tabIdx).shouldNotBeVisible();
    }
}
