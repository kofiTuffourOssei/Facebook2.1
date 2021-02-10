package com.Facebook.utilities;

import com.Facebook.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * Created by RUTHERFORD on 2/8/2021.
 */
public class Capture extends BaseClass{
    public void screenshot() throws IOException {
        File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotfile,new File(System.getProperty("user.dir")
                +"/Screenshots/"+System.currentTimeMillis()+"image.png"));
    }
}
