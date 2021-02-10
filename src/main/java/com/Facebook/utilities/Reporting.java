package com.Facebook.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;

/**
 * Created by RUTHERFORD on 2/8/2021.
 */
public class Reporting extends TestListenerAdapter {
    public static ExtentHtmlReporter extentHtmlReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;
    public static Capture capture;

    @Override
    public void onStart(ITestContext testContext) {
        extentHtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir") +"/Test-output/"+System.currentTimeMillis()+"reports.html");
        extentHtmlReporter.config().setReportName("Facebook User Interface(UI) Test");
        extentHtmlReporter.config().setDocumentTitle("Functional Test");
        extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        extentHtmlReporter.config().setTheme(Theme.DARK);

        extentReports=new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("HostName","Local Host");
        extentReports.setSystemInfo("OS","Windows 10");
        extentReports.setSystemInfo("Programming Language","JAVA");
        extentReports.setSystemInfo("QA Engineer","Kofi");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        extentTest=extentReports.createTest(tr.getName());
        extentTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        if (tr.getStatus()==ITestResult.FAILURE){
            try {
                capture.screenshot();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        extentTest=extentReports.createTest(tr.getName());
        extentTest.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        extentTest=extentReports.createTest(tr.getName());
        extentTest.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
    }

    @Override
    public void onFinish(ITestContext testContext) {
        System.out.println("Test context "+testContext.getName());
        extentReports.flush();
    }
}
