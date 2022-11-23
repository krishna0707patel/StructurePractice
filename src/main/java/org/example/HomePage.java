package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


// create class homepage as a child class with extend utils as a parent class
public class HomePage extends Utils {


    // creating private class for registerbutton and searchfield
    private final By _registerButton = By.linkText("Register");


    // creating private class for vote button

    private By _voteButton = By.id("vote-poll-1");

    // creating private class for apple mac book pro picture

    private By _appleMacBookProPicture = By.xpath("//div[@class=\"picture\"]//a[@href=\"/apple-macbook-pro-13-inch\"]");

    // creating private class for facebook button

    private By _facebookButton = By.xpath("//li[@class=\"facebook\"]");


    // click on register button make a method

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    // to verify register button make a method
    public void verifyRegisterButtonPresent() {
        Assert.assertEquals(getTextFromElement(By.className("ico-register")), "Register", "Register button id registered");
    }

    // click on electronics  make a method
    public void clickOnElectronics() {

        clickOnElement(By.linkText("Electronics"));

    }

    // click on currency US Dollar make a method
    public void clickOnCurrencyUSDollar() {

        // find web element currency

        WebElement currency = driver.findElement(By.id("customerCurrency"));

        // create select object for currency inside the method

        Select select = new Select(currency);

        // select US Dollar from drop down list

        select.selectByVisibleText("US Dollar");

        // create a list webelement  for product currency
        List<WebElement> productCurrency = driver.findElements(By.linkText("$1,200.00"));
        // using for loop
        for (WebElement e : productCurrency) {

            // using assert true function through gettext
            Assert.assertTrue(e.getText().contains("$"));
        }

    }

    // make a method  for  click on currency Euro
    public void clickOnCurrencyEuro() {

        // find web element currency

        WebElement currency = driver.findElement(By.id("customerCurrency"));

        // create select object for currency inside the method

        Select select = new Select(currency);

        // select Euro from drop down list
        select.selectByVisibleText("Euro");

        // create a list webelement  for product currency
        List<WebElement> productCurrency = driver.findElements(By.linkText("€1032.00"));

        // using for loop
        for (WebElement e : productCurrency) {

            // using assert true function through gettext
            Assert.assertTrue(e.getText().contains("€"));
        }
    }


    // make a method for click on news comments
    public void clickOnNewsComments() {

        // click on element by using xpath locator

        clickOnElement(By.xpath("//a[contains(@href, \"release\") and contains(@class, \"read\")]"));

    }

    // ma a method for click on apple mac book pro 13 inch
    public void clickOnAppleMacBookPro13inch() {

        // click on element apple mac book pro picture by calling private class inside the method

        clickOnElement(_appleMacBookProPicture);
    }

    // make a method for click on vote button
    public void clickOnVoteButton() {

        // click on element vote button by calling private class inside the method

        clickOnElement(_voteButton);

        // using alert accept function

        driver.switchTo().alert().accept();


    }
//
//    // make a method for click on facebook button
//    public void clickOnFacebookButton(){
//
//        // click on element facebook button by calling private class inside the method
//
//        clickOnElement(_facebookButton);
//
//    }
//
//    // make a method for click on facebook page for check
//    public void clickOnFacebookPageForCheck(){
//
//        // window handles
//
//        Set w = driver.getWindowHandles();
//
//        // window handles iterate
//
//        Iterator t = w.iterator();
//
//        // string child window
//
//        String ch = t.next().toString();
//
//        // string parent window
//
//        String pw = t.next().toString();
//
//        // switching child window
//
//        driver.switchTo().window(ch);
//
//        System.out.println("Child window title "+ driver.getTitle());
//
//        // close the child browser window
//
//        driver.close();
//
//        // switching parent window
//
//        driver.switchTo().window(pw);
//
//        System.out.println("Parent window title: "+ driver.getTitle());
//
////        driver.quit();
//
//
//
//}


}

































//    public void  clickOnAlertButton(){
//
//    }


