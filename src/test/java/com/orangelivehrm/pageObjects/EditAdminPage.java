package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditAdminPage {
    WebDriver ldriver;

    public EditAdminPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(className = "oxd-input oxd-input--active")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(className = "oxd-select-text-input")
    @CacheLookup
    WebElement userRoleDropDown;

    @FindBy(className = "oxd-select-text-input")
    @CacheLookup
    WebElement userStatusDropDown;

    @FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary")
    @CacheLookup
    WebElement saveButton;

    public void enterUserName(String aname) {
        txtUserName.clear();
        txtUserName.sendKeys(aname);
    }

    public void selectUserRole(String urole) {
        Select userRoleSelect = new Select(userRoleDropDown);
        userRoleSelect.selectByVisibleText(urole);
    }

    public void selectUserStatus(String ustatus) {
        Select userStatusSelect = new Select(userStatusDropDown);
        userStatusSelect.selectByVisibleText(ustatus);
    }

    public void clickSaveButton() {

        saveButton.click();
    }
}

