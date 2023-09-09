package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
    WebDriver ldriver;

    public AddEmployeePage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(className = "oxd-main-menu-item--name")
    @CacheLookup
    WebElement employeeElement;

    @FindBy(css = "oxd-button.oxd-button--medium.oxd-button--secondary")
    @CacheLookup
    WebElement addButton;

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

    public void clickAdd(){
        addButton.click();
    }
    public void firstName(String fname){
        txtFirstName.sendKeys(fname);
    }

    public void middleName(String mname){
        txtMiddleName.sendKeys(mname);
    }
    public void lastName(String lname){
        txtLastName.sendKeys(lname);
    }
    public void clickSave(){
        saveButton.click();
    }

}
