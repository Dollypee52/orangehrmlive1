package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.DeleteEmployeePage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DeleteEmployee_Test_008 extends BaseClass{
    @Test
    public void deleteEmployee() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is provided");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.clickSubmit();
        Thread.sleep(3000);

        DeleteEmployeePage deleteEmployeePage = new DeleteEmployeePage(driver);
        deleteEmployeePage.clickPim();  // Navigate to PIM
        deleteEmployeePage.clickDelete();  // Click on "Delete" button


        Assert.assertTrue(driver.getPageSource().contains("Employee deleted successfully"));
    }
}

