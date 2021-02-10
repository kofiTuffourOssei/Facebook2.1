package com.Facebook.base;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by RUTHERFORD on 2/6/2021.
 */
public class BaseClass {
    public static Logger logger;
    public static WebDriver driver;
    public static Properties properties;

    public BaseClass(){
        logger=Logger.getLogger("Facebook");
        try {
            properties=new Properties();
            FileInputStream file=new FileInputStream("Configuration/configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initialization(){
        String browserName=properties.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if (browserName.equals("msedge")){
            System.setProperty("webdriver.msedge.driver","Drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        }
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }
}

