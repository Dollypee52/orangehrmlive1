package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.EditAdminPage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC_EditAdmin_Test_004 extends BaseClass{
    @Test
    public void editAdmin() throws InterruptedException {
        // Log in to the application
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is provided");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.clickSubmit();

        // Edit admin details
        EditAdminPage editAdminPage = new EditAdminPage(driver);
        logger.info("Editing admin details");

        // Provide new details
        editAdminPage.enterUserName("Shola");
        editAdminPage.selectUserRole("Admin");
        editAdminPage.selectUserStatus("Disabled");
        editAdminPage.clickSaveButton();

        Thread.sleep(3000);
    }
}


