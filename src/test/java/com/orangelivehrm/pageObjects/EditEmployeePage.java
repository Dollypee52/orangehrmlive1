package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeePage {
    WebDriver ldriver;

    public EditEmployeePage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(className = "oxd-main-menu-item--name")
    @CacheLookup
    WebElement employeeElement;

    @FindBy(css = "oxd-button.oxd-button--medium.oxd-button--secondary")
    @CacheLookup
    WebElement editButton;

    @FindBy(name = "firstName")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(name = "middleName")
    @CacheLookup
    WebElement txtMiddleName;

    @FindBy(name = "lastName")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(className = "oxd-button--medium oxd-button--secondary orangehrm-left-space")
    @CacheLookup
    WebElement saveButton;

    public void clickPim(){
        employeeElement.click();
    }

    public void clickEdit(){
        editButton.click();
    }

    public void updateFirstName(String fname){
        txtFirstName.clear();
        txtFirstName.sendKeys(fname);
    }

    public void updateMiddleName(String mname){
        txtMiddleName.clear();
        txtMiddleName.sendKeys(mname);
    }

    public void updateLastName(String lname){
        txtLastName.clear();
        txtLastName.sendKeys(lname);
    }

    public void clickSave(){
        saveButton.click();
    }
}


