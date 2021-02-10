package com.Facebook.testCases;

import com.Facebook.base.BaseClass;
import com.Facebook.pages.CreateNewAccountPage;
import com.Facebook.utilities.Reporting;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/6/2021.
 */
@Listeners({Reporting.class})
public class CreateNewAccountPageTest extends BaseClass {
    public static CreateNewAccountPage createNewAccountPage;
    public CreateNewAccountPageTest(){
        super();
    }
    @BeforeTest
    public void setUp(){
        initialization();
        createNewAccountPage=new CreateNewAccountPage(driver);
        createNewAccountPage.setCreateAccountButton();
    }
    @Test(priority = 0)
    public void testfirstName(){
        createNewAccountPage.setFirstNameField("John");
    }
    @Test(priority = 1)
    public void testlastName(){
        createNewAccountPage.setLastNameField("Johnson");
    }
    @Test(priority = 2)
    public void testEmailField(){
        createNewAccountPage.setEmailField("enteremail@yahoo.com");
    }
    @Test(priority = 3)
    public void testEmailFieldV(){
        createNewAccountPage.setRe_enterEmail("enteremail@yahoo.com");
    }
    @Test(priority = 4)
    public void testpasswordField() throws InterruptedException {
        createNewAccountPage.setNewpasswordField("47!8585");
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void testDoBMonth(){
        createNewAccountPage.setDoBMonth();
    }
    @Test(priority = 6)
    public void testDoBDay(){
        createNewAccountPage.setDoBDay();
    }
    @Test(priority = 7)
    public void testDoBYear(){
        createNewAccountPage.setDoBYear();
    }
    @Test(priority = 8)
    public void testGender(){
        createNewAccountPage.setGenderclickMale();
    }
    @Test(priority = 9)
    public void testSignButton(){
        createNewAccountPage.setSignUpButton();
    }
}
