package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseTest {

    DriverManager driverManager = new DriverManager();

    @Before

    public void setup() {

        // for open the browser
        driverManager.openBrowser();
    }


    @After

    public void teardown(Scenario scenario)  {

        if (scenario.isFailed()) {

            TakesScreenshot ts  = (TakesScreenshot)  driver;

            byte[]  src  = ts.getScreenshotAs(OutputType.BYTES);

            scenario.attach(src, "image/png", "screenshot");

        }



        // for close the browser
        driverManager.closeBrowser();
    }


}
