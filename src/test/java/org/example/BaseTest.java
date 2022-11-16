package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    // creating object for driver manager
    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setup() {

        // for open the browser
        driverManager.openBrowser();
    }

    @AfterMethod
    public void teardown() {
        // for close the browser
        driverManager.closeBrowser();
    }


}
