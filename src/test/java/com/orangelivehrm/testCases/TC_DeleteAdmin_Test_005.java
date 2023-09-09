package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.DeleteAdminPage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DeleteAdmin_Test_005 extends BaseClass{

    @Test
    public void deleteAdmin() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is provided");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.clickSubmit();
        Thread.sleep(3000);

        DeleteAdminPage deleteAdminPage = new DeleteAdminPage(driver);
        deleteAdminPage.clickAdmin();  // Navigate to Admin section
        deleteAdminPage.clickDelete();  // Click on "Delete" button

        Assert.assertTrue(driver.getPageSource().contains("Admin deleted successfully"));
    }
}


