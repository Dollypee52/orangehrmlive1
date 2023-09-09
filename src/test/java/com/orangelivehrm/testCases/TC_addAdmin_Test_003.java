package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.AddAdminPage;
import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC_addAdmin_Test_003 extends BaseClass{
    @Test
    public void addAdmin() throws InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is provided");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.clickSubmit();

        Thread.sleep(3000);
        AddAdminPage adminp=new AddAdminPage(driver);

        logger.info("providing admin details");

        adminp.userName("Moses");
        adminp.employeeName("Moses");
        adminp.selectUserRole("Admin");
        adminp.selectUserStatus("Enabled");
        adminp.clickAdd();

        Thread.sleep(3000);

    }
}
