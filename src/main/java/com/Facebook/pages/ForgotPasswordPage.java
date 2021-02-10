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
public class ForgotPasswordPage extends BaseClass {
    public ForgotPasswordPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "//*[@id=\"u_0_a\"]/div[3]/a")
    @CacheLookup
    WebElement forgotpasswordButton;

    @FindBy(xpath = "//*[@id=\"identify_email\"]")
    @CacheLookup
    WebElement findaccountField;

    @FindBy(xpath = "//*[@id=\"did_submit\"]")
    @CacheLookup
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")
    @CacheLookup
    WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"captcha_dialog_submit_button\"]")
    @CacheLookup
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"recovery_code_entry\"]")
    @CacheLookup
    WebElement entercode;

    @FindBy(xpath = "//*[@id=\"u_0_9\"]/div/div[3]/div/div[1]/button")
    @CacheLookup
    WebElement finalcontinueButton;

    @FindBy(xpath = "//*[@id=\"password_new\"]")
    @CacheLookup
    WebElement newpassword;

    @FindBy(xpath = "//*[@id=\"password_new_show\"]")
    @CacheLookup
    WebElement hideButton;

    @FindBy(xpath = "//*[@id=\"btn_continue\"]")
    @CacheLookup
    WebElement continuefinale;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div[1]/a[2]/span")
    @CacheLookup
    WebElement cancelButton;


    public void setForgotpasswordButton(){
        forgotpasswordButton.click();
        logger.info("Password button clicked");
    }
    public void setFindaccountField(String findaccount){
        findaccountField.sendKeys(findaccount);
        logger.info("Email entered in search account field");
    }
    public void setSearchButton(){
        searchButton.click();
        logger.info("Search button clicked");
    }
    public void setContinueButton() {
        continueButton.click();
        logger.info("Continue button clicked");
    }
    public void setSubmitButton(){
        submitButton.click();
        logger.info("Submit button clicked");
    }
    public void setEntercode(String code){
        entercode.sendKeys(code);
        logger.info("Verification code entered");
    }
    public void setFinalcontinueButton(){
        finalcontinueButton.click();
        logger.info("Continue button clicked");
    }
    public void setNewpassword(String npswd){
        newpassword.sendKeys(npswd);
        logger.info("Password entered");
    }
    public void setHideButton(){
        hideButton.click();
        logger.info("Hide password button clicked");
    }
    public void setContinuefinale(){
        continuefinale.click();
        logger.info("Continue button clicked");
    }
    public void setCancelButton(){
        cancelButton.click();
        logger.info("Cancel button clicked");
    }

}
