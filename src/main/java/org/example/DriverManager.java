package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class DriverManager extends Utils {


    // for open browser
    public void openBrowser() {

        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");

        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();

        // to maximise the browser window
        driver.manage().window().fullscreen();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.get command used for to open  URL.it will wait till the whole page gets loaded.
        driver.get("https://demo.nopcommerce.com/");
    }


        // for closing browser
        public void closeBrowser(){
            driver.quit();

        }


    }
