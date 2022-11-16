package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {
    // creating private class for registerbutton and searchfield
    private By _registerButton = By.linkText("Register");
    private By _searchField = By.id("small-searchtearms");

    // click on register button

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    // to verify register button
    public void verifyRegisterButtonPresent() {
        Assert.assertEquals(getTextFromElement(By.className("ico-register")), "Register", "Register button id registered");
    }
}
