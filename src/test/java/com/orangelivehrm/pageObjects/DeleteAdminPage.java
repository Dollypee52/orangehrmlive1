package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeleteAdminPage {
    WebDriver ldriver;

    public DeleteAdminPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(className = "oxd-text oxd-text--span oxd-main-menu-item--name")
    @CacheLookup
    WebElement adminElement;

    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary")
    @CacheLookup
    WebElement deleteButton;

    public void clickAdmin(){
        adminElement.click();
    }

    public void clickDelete(){
        deleteButton.click();
    }
}