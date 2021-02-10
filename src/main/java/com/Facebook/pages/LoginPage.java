package com.Facebook.pages;

import com.Facebook.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RUTHERFORD on 2/7/2021.
 */
public class LoginPage  extends BaseClass{
    public LoginPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "//*[@id=\"email\"]")
    @CacheLookup
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"u_0_b\"]")
    @CacheLookup
    WebElement loginButton;

    public void setEmailField(String semail){
        emailField.sendKeys(semail);
    }
    public void setPasswordField(String spswd){
        passwordField.sendKeys(spswd);
    }
    public void setLoginButton(){
        loginButton.click();
    }
}
