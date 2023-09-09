package com.orangelivehrm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);

    }
    @FindBy(name = "username") // Updated locator to use name
    @CacheLookup
    WebElement txtUserName;

    @FindBy(name = "password") // Updated locator to use name
    @CacheLookup
    WebElement txtPassword;

    @FindBy(className = "oxd-button--main") // Updated locator to use class name
    @CacheLookup
    WebElement btnLogin;

    public void setUserName(String uname){
        txtUserName.sendKeys(uname);
    }
    public void setPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }
    public void clickSubmit(){
        btnLogin.click(); // No need to find the button again, as it's already located during initialization.
    }

}
