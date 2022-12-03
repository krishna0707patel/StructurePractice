
Feature: As a user, I should be able to register so that I can use my account facility

  @Reg
  Scenario: I should be register successfully
    Given I am on register page
    When I enter required registration details
    Then I should be able to register successfully




#Feature: : Registration
#  Background:https://demo.nopcommerce.com/
#    Given I am on homepage
#    When I click on register button
#
#  Scenario: As a user I want to register successfully
#
#    Given I am on registration page
#    When I select gender
#    And I entre firstname
#    And I entre lastname
#    And I select date of birth, month, year
#    And I entre email ID
#    And I entre company details
#    And I select on newsletter
#    And I entre password
#    And I entre confirm password
#    And I click on register button
#    Then I should be able register successfully


