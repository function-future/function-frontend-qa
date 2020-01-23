package com.future.function.qa.steps.Core.Files;

import com.future.function.qa.components.ModalCreateFolder;
import com.future.function.qa.pages.core.Files.FilesPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.*;

public class FilesSteps {

    private HomePage homePage;
    private FilesPage filesPage;
    private ModalCreateFolder modalCreateFolder;
    private String randomString = getSaltString(6);

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
        modalCreateFolder.folderNameInput().type(name + " " + randomString);
    }

    @And("^user click on create button on create folder modal$")
    public void userClickOnCreateButton() {
        modalCreateFolder.createButton().shouldBeVisible();
        modalCreateFolder.createButton().click();
    }

    private String getSaltString(int length) {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) {
            int index = (int) (rnd.nextFloat() * string.length());
            salt.append(string.charAt(index));
        }
        return salt.toString();
    }
}
