package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAdminPage {
    WebDriver ldriver;

    public AddAdminPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(className = "oxd-text oxd-text--span oxd-main-menu-item--name")
    @CacheLookup
    WebElement adminElement;

    @FindBy(className = "xd-input oxd-input--active") // Updated locator to use classname
    @CacheLookup
    WebElement txtUserName;

    @FindBy(className = "oxd-select-text-input") // Updated locator to use classname
    @CacheLookup
    WebElement userRoleDropDown;

    @FindBy(css = "input[data-v-75e744cd]")
    @CacheLookup
    WebElement txtEmployee;


    @FindBy(className = "oxd-select-text-input") // Updated locator to use classname
    @CacheLookup
    WebElement userStatusDropDown;

    @FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary")
    @CacheLookup
    WebElement addButton;


    public void clickAdmin(){
        adminElement.click();
    }
    public void userName(String aname){
        txtUserName.sendKeys(aname);
    }
    public void selectUserRole(String urole) {
        Select userRoleSelect = new Select(userRoleDropDown);
        userRoleSelect.selectByVisibleText(urole);
    }
    public void employeeName(String ename){
        txtEmployee.sendKeys(ename);
    }
    public void selectUserStatus(String ustatus) {
        Select userStatusSelect = new Select(userStatusDropDown);
        userStatusSelect.selectByVisibleText(ustatus);
    }
    public void clickAdd(){
        addButton.click();

    }
}
