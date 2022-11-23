package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    // creating homepage object
    HomePage homePage = new HomePage();
    // creating object for register page
    RegisterPage registerPage = new RegisterPage();
    //creating object for register result page
    RegisterResultPage registerResultPage = new RegisterResultPage();

    // creating object for electronicPage
    ElectronicPage electronicPage = new ElectronicPage();

    // creating object for cameraPhotoPage
    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();

    // creating object for newsDetailComment

    NewsDetailComment newsDetailComment = new NewsDetailComment();

    // creating object for macBookEmailAFriend

    MacBookEmailAFriend macBookEmailAFriend = new MacBookEmailAFriend();

    FaceBook faceBook = new FaceBook();


    // create @Test annotation
    @Test
    // make a new method
    public void verifyRegisterButtonIsOnHomepage() {

        // to verify register button on homepage

        homePage.verifyRegisterButtonPresent();

    }

    // create @Test annotation
    @Test
    // make a new method
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


    // create @Test annotation
    @Test
    // make a new method
    public void verifyEachProductHasName() {

        // call method from homepage

        homePage.clickOnElectronics();

        //

        electronicPage.clickOnCameraAndPhotoPage();

        cameraPhotoPage.printProductTitle();

    }
    // create @Test annotation
    @Test
    // make a new method
     public void verifyCorrectCurrencySymbolDisplayedForAllProductsOnHomepage(){

        // call method from homepage

        homePage.clickOnCurrencyUSDollar();

        // call method from homepage
        homePage.clickOnCurrencyEuro();
    }
    // create @Test annotation
    @Test
    // make a new method
    public void verifyUserShouldAddNewsCommentAndCommentShowAsBottomOfTheList(){

        // call method from homepage

        homePage.clickOnNewsComments();

        // call method from news detail comment class
        newsDetailComment.userEnterNewsDetailComment();

    }
    // create @Test annotation
    @Test
    // make a new method
    public void verifyUserShouldAbleToEmailAFriendSuccessfully(){

        // call method from homepage

        homePage.clickOnRegisterButton();

        // call method from register page class
        registerPage.enterRegistrationDetails();

        // call method from register result page
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();

        // call method from register page
        registerPage.verifyUserShouldClickOnContinueButton();

        // call method from homepage
        homePage.clickOnAppleMacBookPro13inch();

        // call method from mac book email a friend
        macBookEmailAFriend.clickOnEmailAFriendButton();

    }
    // create @Test annotation
    @Test
    // make a new method
    public void userShouldVerifyAlertPopupOnVoteButton(){

        // call method from homepage

        homePage.clickOnVoteButton();
    }

    // create @Test annotation
    @Test

    // make a new method

    public void UserShouldVerifyFacebookPageAndComeToMainWindow(){

        // call method from facebook
        faceBook.verifyFacebookButtonIsOnHomepage();

    }



}







