package com.orangelivehrm.testCases;

import com.orangelivehrm.pageObjects.LoginPage;
import com.orangelivehrm.utilities.XLUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginDDT_002 extends BaseClass {

    @Test(dataProvider = "LoginData")
    public void loginDDT(String username, String password) throws InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username provided");
        lp.setPassword(password);
        logger.info("password provided");
        lp.clickSubmit();

        Thread.sleep(3000);

        if(isAlertPresent()==true){
            driver.switchTo().alert().accept(); //close alert
            driver.switchTo().defaultContent();
            Assert.assertTrue(false);
            logger.warn("Login failed");
        }
        else {
            Assert.assertTrue(true);
            logger.warn("Login passed");
            Thread.sleep(3000);
        }
    }

    public boolean isAlertPresent(){ //user method created to check alert is present or not
        try{
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException e){
            return false;
        }
    }

    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/java/com/orangelivehrm/testData/Seamless.xlsx";
        int rownum = XLUtils.getRowCount(path, "Sheet1");
        int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

        String logindata[][] = new String[rownum][colcount];
        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
            }
        }
        return logindata;
    }
}
