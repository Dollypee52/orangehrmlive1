package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.AddEmployeePage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_AddEmployee_Test_006 extends BaseClass{
    @Test
    public void addEmployee() throws InterruptedException {
        // Login
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is provided");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.clickSubmit();

        Thread.sleep(3000);

        // Navigate to Add Employee page
        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        addEmployeePage.clickPim();

        // Click Add button
        addEmployeePage.clickAdd();

        logger.info("providing employee details");

        // Fill in employee details
        addEmployeePage.firstName("Dolapo");
        addEmployeePage.middleName("Shola");
        addEmployeePage.lastName("Angel");

        // Click Save button
        addEmployeePage.clickSave();

        String successMessage = "Employee Dolapo Shola Angel has been successfully added.";
        Assert.assertTrue(driver.getPageSource().contains(successMessage), "Employee added successfully message not found.");

    }
}


