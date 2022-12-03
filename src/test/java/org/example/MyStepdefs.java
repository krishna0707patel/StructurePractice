package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {




    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();


    @Given("I am on register page")
    public void i_am_on_register_page() {


        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();

        homePage.verifyRegisterButtonPresent();
        registerPage.verifyUserIsOnRegisterPage();
//        Utils utils = new Utils();

    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {



        // Write code here that turns the phrase above into concrete actions
        registerPage.enterRegistrationDetails();


    }
    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {

        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();

        // Write code here that turns the phrase above into concrete actions

    }




//
//    @When("I click on {string} link")
//    public void iClickOnLink(String categoryLink) {
//        homePage.clickOnCategoryPage(categoryLink);
//    }
//
//    @Then("I should be able to navigate to related {string} page successfully")
//    public void iShouldBeAbleToNavigateToRelatedPageSuccessfully(String categoryName) {
//        Utils.assertCurrentURL(categoryName);
//    }





// category scenario outline

    @When("I click on {string} link")
    public void i_click_on_link(String categoryLink) {

        // Write code here that turns the phrase above into concrete actions

        homePage.clickOnCategoryPage(categoryLink);



    }
    @Then("I should be able to navigate to related {string} page successfully")
    public void i_should_be_able_to_navigate_to_related_page_successfully(String categoryName) {

        // Write code here that turns the phrase above into concrete actions

        Utils.assertCurrentURL(categoryName);

    }



//    @When("I click on {string} link")
//    public void i_click_on_link(String categoryLink) {
//        homePage.clickOnCategoryPage(categoryLink);
//
//    }
//    @Then("I should be able to navigate to related {string} page successfully")
//    public void i_should_be_able_to_navigate_to_related_page_successfully(String categoryName) {
//        Utils.assertCurrentURL(categoryName);
//
//    }




}
