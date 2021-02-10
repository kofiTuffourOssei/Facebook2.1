package com.Facebook.testCases;

import com.Facebook.base.BaseClass;
import com.Facebook.pages.CreateNewAccountPage;
import com.Facebook.pages.LoginPage;
import com.Facebook.utilities.Reporting;
import com.google.common.base.Verify;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/7/2021.
 */
@Listeners({Reporting.class})
public class LoginPageTest extends BaseClass {
    public static LoginPage loginPage;
    public static CreateNewAccountPage createNewAccountPage;

    public LoginPageTest(){
        super();
    }
    @BeforeTest
    public void setUpLogin(){
        initialization();
        loginPage=new LoginPage(driver);
        createNewAccountPage=new CreateNewAccountPage(driver);
    }
    @Test(priority = 0)
    public void testemailField(){
        loginPage.setEmailField("codename.47@aol.com");
        Assert.assertTrue(true);
        logger.info("Email entered");
    }
    @Test(priority = 1)
    public void testepassword(){
        loginPage.setPasswordField("47!2020");
        Assert.assertTrue(true);
        logger.info("Password entered");
    }
    @Test(priority = 2)
    public void testloginButton(){
        loginPage.setLoginButton();
        Verify.verify(true);
        logger.info("Login button clicked");
    }

}
