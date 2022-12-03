package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest extends Utils {

    // creating object for driver manager
    DriverManager driverManager = new DriverManager();

    // crete a before method

    @BeforeMethod
    public void setup() {

        // for open the browser
        driverManager.openBrowser();
    }


// create after method
    @AfterMethod
    // put inbuilt parameter
    public void teardown(ITestResult result) {




        // using if condition
        // using not equal to "!"   if assert is fail then it will take a screenshot
        if (!result.isSuccess()){
            takeScreenshot(result.getName());
        }



        // for close the browser
        driverManager.closeBrowser();
    }
}



