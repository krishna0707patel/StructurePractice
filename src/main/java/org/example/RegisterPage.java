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

    private By _continueButton = By.xpath("//a[@class=\"button-1 register-continue-button\"]");


    // to verify register page
    public void verifyUserIsOnRegisterPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    public void enterRegistrationDetails()
    {
        // wait for element to be Click on register and wait for the 15 second before that going on next page
        waitForElementToBeClickable(_registerSubmitButton, 15);

        // enter first name
        typeText(_firstNameField, LoadProp.getProperty("firstname"));
        // enter last name
        typeText(_lastNameField, LoadProp.getProperty("lastname"));
        // enter email using get time stamp method
        typeText(_emailField,  LoadProp.getProperty("emailpart1")+ getTimeStamp() + LoadProp.getProperty("emailpart2"));
        // enter date of birthday date
        selectByText(_dateOfBirthDaySelect, LoadProp.getProperty("birthday"));
        // enter date of birth month
        selectByText(_dateOfBirthMonthSelect, LoadProp.getProperty("birthmonth"));
        // enter date of birth year
        selectByText(_dateOfBirthYearSelect, LoadProp.getProperty("birthyear"));
        // enter password field
        typeText(_passwordField, LoadProp.getProperty("password"));
        // enter confirm password field
        typeText(_confirmPasswordField, LoadProp.getProperty("confirmpassword"));
        //click on register submit button
        clickOnElement(_registerSubmitButton);
    }


    // make a method for verifyUserShouldClickOnContinueButton
    public void verifyUserShouldClickOnContinueButton(){

        // click on element calling private class in side the method
        clickOnElement(_continueButton);
    }
}
