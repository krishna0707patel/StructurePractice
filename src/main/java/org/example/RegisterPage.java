package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils {
    // creating private class for registration form required field using locator from register page

    private By _firstNameField = By.id("FirstName");
    private By _lastNameField = By.id("LastName");
    private By _emailField = By.id("Email");
    private By _passwordField = By.name("Password");
    private By _confirmPasswordField = By.name("ConfirmPassword");
    private By _dateOfBirthDaySelect = By.name("DateOfBirthDay");
    private By _dateOfBirthMonthSelect = By.name("DateOfBirthMonth");
    private By _dateOfBirthYearSelect = By.name("DateOfBirthYear");
    private By _registerSubmitButton = By.name("register-button");

    // to verify register page
    public void verifyUserIsOnRegisterPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    public void enterRegistrationDetails() {
        // wait for element to be click on register and wait for the 15 second before that going on next page
        waitForElementToBeClickable(_registerSubmitButton, 15);

        // enter first name
        typeText(_firstNameField, "kristy");
        // enter last name
        typeText(_lastNameField, "shah");
        // enter email using get time stamp method
        typeText(_emailField, "kristyshah" + getTimeStamp() + "@yahoo.com");
        // enter date of birthday date
        selectByText(_dateOfBirthDaySelect, "20");
        // enter date of birth month
        selectByText(_dateOfBirthMonthSelect, "December");
        // enter date of birth year
        selectByText(_dateOfBirthYearSelect, "1999");
        // enter password field
        typeText(_passwordField, "kri99kri");
        // enter confirm password field
        typeText(_confirmPasswordField, "kri99kri");
        //click on register submit button
        clickOnElement(_registerSubmitButton);
    }

}
