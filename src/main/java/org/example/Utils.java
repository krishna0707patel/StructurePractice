package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

// Utils class as a child class extends with Basepage parent class
public class Utils extends BasePage {


    // creating method typetext to use perform in webpage
    public static void typeText(By by, String text) {
        DriverManager.driver.findElement(by).sendKeys(text);
    }


    // creating method selectbytext to use perform in webpage
    public static void selectByText(By by, String text) {
        org.openqa.selenium.support.ui.Select select = new Select(driver.findElement(by));
    }


    // creating method gettimestamp to use perform in webpage
    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyyMMDDHHmmss").format(new Date());
    }


    // creating method gettextfromelement to use perform in webpage
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    // creating method waitforelementtobeclickable to use perform in webpage
    public static void waitForElementToBeClickable(By by, int duration) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    // creating method waitforurltobe to use perform in webpage
    public static void waitForUrlToBe(String url, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }


    public static void selectFromDropDownByVisibleText() {

        //using select class to create object selectMonth with the locator
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        // To select Month 5 use selectByValue function
        selectMonth.selectByValue("5");
    }


    public static void selectFromDropDownByValue() {
        //using select class to create object selectMonth with the locator
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        // To select Month 5 use selectByValue function
        selectMonth.selectByValue("5");

    }


    public static void selectFromDropDownByIndex() {
        //using select class to create object selectYear with the locator
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        // // To select Year 7 use selectByIndex function
        selectYear.selectByIndex(7);
    }


    // creating method clickonelement to use perform in webpage
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // creating method take screenshot
    public void takeScreenshot(String screenShotName) {

        // create object
        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);


        //Move image file to new destination

        File DestFile = new File("src/main/ScreenShot/" + screenShotName + getTimeStamp() + ".jpg");

        //Copy file at destination
        // using try and catch
        try {

            FileUtils.copyFile(SrcFile, DestFile);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

    // using click on alert
    public void clickOkOnAlert() {
        driver.switchTo().alert().accept();
    }


    public static void assertCurrentURL(String categoryName){
        Assert.assertTrue(driver.getCurrentUrl().contains(categoryName));
    }



}
