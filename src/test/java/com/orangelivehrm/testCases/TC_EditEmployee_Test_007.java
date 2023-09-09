package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.EditEmployeePage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_EditEmployee_Test_007 extends BaseClass{

    @Test
    public void editEmployeeDetails() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setPassword(password);
        lp.clickSubmit();
        Thread.sleep(3000);

        // Navigate to PIM and click on the "Edit" button for an employee
        EditEmployeePage editEmployeePage = new EditEmployeePage(driver);
        editEmployeePage.clickPim();  // Assuming this navigates to the PIM section
        editEmployeePage.clickEdit(); // Assuming this clicks on the "Edit" button

        // Update employee details
        editEmployeePage.updateFirstName("Dolapo");
        editEmployeePage.updateMiddleName("Shola");
        editEmployeePage.updateLastName("Gbadebo");

        // Save the changes
        editEmployeePage.clickSave();


        Assert.assertTrue(driver.getPageSource().contains("Employee details updated successfully"));
    }
}


