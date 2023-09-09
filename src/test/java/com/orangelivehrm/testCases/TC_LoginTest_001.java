package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertNotNull;


public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws IOException {


        // Step 2: Log information
        logger.info("URL is opened");

        // Step 3: Initialize the LoginPage
        LoginPage lp = new LoginPage(driver);

        // Step 4: Set username and password
        lp.setUserName(username);
        logger.info("Entered username");
        lp.setPassword(password);
        logger.info("Entered password");

        // Step 5: Click Submit
        lp.clickSubmit();

        // Step 6: Check the title
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            // If login is successful
            Assert.assertTrue(true, "Login test passed");
            logger.info("Login test passed");
        } else {
            // If login fails
            captureScreen(driver,"loginTest");
            Assert.fail("Login test failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
            logger.error("Login test failed");
        }
    }
}
