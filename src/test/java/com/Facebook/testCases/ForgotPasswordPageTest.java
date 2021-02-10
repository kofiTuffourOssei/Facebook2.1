package com.Facebook.testCases;

import com.Facebook.base.BaseClass;
import com.Facebook.pages.CreateNewAccountPage;
import com.Facebook.pages.ForgotPasswordPage;
import com.Facebook.pages.LoginPage;
import com.Facebook.utilities.Reporting;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/7/2021.
 */
@Listeners(Reporting.class)
public class ForgotPasswordPageTest extends BaseClass{
    public static LoginPage loginPage;
    public static CreateNewAccountPage createNewAccountPage;
    public static ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordPageTest(){
        super();
    }
    @BeforeTest
    public void setUpForgot(){
        initialization();
        loginPage=new LoginPage(driver);
        createNewAccountPage=new CreateNewAccountPage(driver);
        forgotPasswordPage=new ForgotPasswordPage(driver);
        forgotPasswordPage.setForgotpasswordButton();
    }
    @Test(priority = 0)
    public void testfindaccount(){
        forgotPasswordPage.setFindaccountField("enteremail@yahoo.com");
    }
    @Test(priority = 1)
    public void testsearch(){
        forgotPasswordPage.setSearchButton();
    }
    @Test(priority = 2)
    public void testcontinue() throws InterruptedException {
        forgotPasswordPage.setContinueButton();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void testsub(){
        forgotPasswordPage.setSubmitButton();
    }
    @Test(priority = 4)
    public void testcode(){
        forgotPasswordPage.setEntercode("332765");// Enter verification code sent to email in String field ""
    }
    @Test(priority = 5)
    public void setFinalcontinueButton(){
        forgotPasswordPage.setFinalcontinueButton();
    }
    @Test(priority = 6)
    public void testnewpassword(){
        forgotPasswordPage.setNewpassword("47$2020");
    }
    @Test(priority = 7)
    public void testhidebutton(){
        forgotPasswordPage.setHideButton();
    }
    @Test(priority = 8)
    public void testfinalecontinue(){
        forgotPasswordPage.setContinuefinale();
    }
    @Test(priority = 9)
    public void testcancelButton(){
        forgotPasswordPage.setCancelButton();
    }
}
