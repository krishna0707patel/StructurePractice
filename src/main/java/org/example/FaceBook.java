package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

// create a class
public class FaceBook extends Utils{

    // create a private class

    private By _facebookbutton = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");

    String regMsg = "www.facebook.com/nopCommerce";


    // create a method
    public void verifyFacebookButtonIsOnHomepage() {

        // store the current window handle

        String MainWindowHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        clickOnElement(_facebookbutton);

        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }

        // Perform the actions on new window
        System.out.println(driver.getCurrentUrl());

        // Close the new window, if that window no more required
        driver.close();

        // Switch back to original browser (first window)
        driver.switchTo().window(MainWindowHandleBefore);

        Assert.assertEquals(regMsg, "www.facebook.com/nopCommerce", "Facebook page is not open successfully");


    }


}
