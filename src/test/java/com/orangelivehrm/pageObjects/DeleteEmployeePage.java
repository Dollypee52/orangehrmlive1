package com.orangelivehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmployeePage {
    WebDriver ldriver;

    public DeleteEmployeePage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(className = "oxd-main-menu-item--name")
    @CacheLookup
    WebElement employeeElement;

    @FindBy(css = "oxd-button.oxd-button--medium.oxd-button--secondary")
    @CacheLookup
    WebElement deleteButton;  // Assuming there's a "Delete" button available next to each employee

    public void clickPim() {
        employeeElement.click();
    }

    public void clickDelete() {
        deleteButton.click();
    }
}

