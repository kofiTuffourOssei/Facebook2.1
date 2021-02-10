package com.Facebook.pages;

import com.Facebook.base.BaseClass;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/6/2021.
 */
public class CreateNewAccountPage extends BaseClass{
    public CreateNewAccountPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(linkText = "Create New Account")
    @CacheLookup
    WebElement createAccountButton;

    @FindBy(xpath = "//input[@name='firstname']")
    @CacheLookup
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    @CacheLookup
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name='reg_email__']")
    @CacheLookup
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"u_1_j\"]")
    @CacheLookup
    WebElement re_enteremail;

    @FindBy(xpath = "//input[@name='reg_passwd__']")
    @CacheLookup
    WebElement newpasswordField;

    @FindBy(xpath = "//*[@id=\"month\"]")
    @CacheLookup
    WebElement DoBMonth;

    @FindBy(xpath = "//*[@id=\"day\"]")
    @CacheLookup
    WebElement DoBDay;

    @FindBy(xpath = "//*[@id=\"year\"]")
    @CacheLookup
    WebElement DoBYear;

    @FindBy(xpath = "//*[@id=\"u_1_3\"]")
    @CacheLookup
    WebElement GenderclickMale;

    @FindBy(xpath = "//*[@id=\"u_1_s\"]")
    @CacheLookup
    WebElement SignUpButton;

    public void setCreateAccountButton(){
        createAccountButton.click();
        logger.info("Create account button clicked");
    }
    public void setFirstNameField(String name){
        firstNameField.sendKeys(name);
        logger.info("First name entered");
    }
    public void setLastNameField(String last){
        lastNameField.sendKeys(last);
        logger.info("Last name entered");
    }
    public void setEmailField(String mail){
        emailField.sendKeys(mail);
        logger.info("email entered");
    }
    public void setRe_enterEmail(String re){
        re_enteremail.sendKeys(re);
        logger.info("Email re-entered");
        Verify.verify(true);
        logger.info("Verification--true");
    }
    public void setNewpasswordField(String pswd){
        newpasswordField.sendKeys(pswd);
        logger.info("Password entered");
    }
    public void setDoBMonth(){
        Select month=new Select(DoBMonth);
        month.selectByIndex(4);
        logger.info("Date of Birth-Month selected.");
    }
    public void setDoBDay(){
        Select day=new Select(DoBDay);
        day.selectByIndex(5);
        logger.info("Date of Birth-Day selected");
    }
    public void setDoBYear(){
        Select year=new Select(DoBYear);
        year.selectByIndex(30);
        logger.info("Date of Birth-Year selected");
    }
    public void setGenderclickMale(){
        GenderclickMale.click();
        logger.info("Gender selected--Male");
    }
    public void setSignUpButton(){
        SignUpButton.click();
        logger.info("Sign button clicked");
    }
}
