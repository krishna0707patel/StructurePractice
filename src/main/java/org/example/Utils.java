package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

// Utils class as a child class extends with Basepage parent class
public class Utils extends BasePage {
    public static void typeText(By by, String text) {
        DriverManager.driver.findElement(by).sendKeys(text);
    }
    // creating method typetext to use perform in webpage

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


}
