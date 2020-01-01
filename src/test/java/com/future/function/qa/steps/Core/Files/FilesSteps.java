package com.future.function.qa.steps.Core.Files;

import com.future.function.qa.components.ModalCreateFolder;
import com.future.function.qa.pages.core.Files.FilesPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilesSteps {

    private HomePage homePage;
    private FilesPage filesPage;
    private ModalCreateFolder modalCreateFolder;

    @And("^user should see files menu on row (\\d+)$")
    public void userSeeFilesMenu(int row) {
        homePage.findMenuWithIndex(row).shouldBeVisible();
    }

    @When("^user click files menu on row (\\d+)$")
    public void userClickFilesMenu(int row) {
        homePage.findMenuWithIndex(row).click();
    }

    @Then("^user should be on files page$")
    public void userShouldBeOnFilesPage() {
        filesPage.shouldBeDisplayed();
    }

    @When("^user click on create folder button on files page$")
    public void userClickOnCreateFolderButtonOnFilesPage() {
        filesPage.createFolderButton().shouldBeVisible();
        filesPage.createFolderButton().click();
    }

    @Then("^create folder modal should be visible$")
    public void createFolderModalShouldBeVisible() {
        modalCreateFolder.modalDialog().shouldBeVisible();
    }

    @When("^user type in \"([^\"]*)\" in folder name input box on create folder modal$")
    public void userTypeInFolderNameInputBox(String name) {
        modalCreateFolder.folderNameInput().type(name);
    }

    @And("^user click on create button on create folder modal$")
    public void userClickOnCreateButton() {
        modalCreateFolder.createButton().shouldBeVisible();
        modalCreateFolder.createButton().click();
    }

}
