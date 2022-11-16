package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    // creating homepage object
    HomePage homePage = new HomePage();
    // creating object for register page
    RegisterPage registerPage = new RegisterPage();
    //creating object for register result page
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test

    // to verify register button om homepage
    public void verifyRegisterButtonIsOnHomepage() {
    // to verify register button om homepage
        homePage.verifyRegisterButtonPresent();

    }


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        // click on register button
        homePage.clickOnRegisterButton();

        // verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();

        // user should  enter registration details
        registerPage.enterRegistrationDetails();

        // verify user should be registered successfully
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
    }

//    @Test
//    public void userShouldAbleToReferAProductToFriend(){
//    }

}
