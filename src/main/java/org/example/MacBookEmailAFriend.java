package org.example;

import org.openqa.selenium.By;

// create a public child class with extends parent class

public class MacBookEmailAFriend extends Utils {

    // create a private class using xpath locator

    static String expectedRegMsg = "Only Registerd customers are able to use feature Email a friend";

    // create a private class using id locator
    private By _emailAFriend = By.xpath("//div[@class=\"email-a-friend\"]");

    // create a private class using id locator
    private By _friendEmailfield = By.id("FriendEmail");
    private By _personalmessage = By.id("PersonalMessage");

    // string expected message
    // create a private class using name locator
    private By _sendemail = By.name("send-email");

    // make a method for click on email a friend button
    public void clickOnEmailAFriendButton() {

        // using click on element call private class inside the method

        clickOnElement(_emailAFriend);

        // using type text call private class inside the method with sendkey text

        typeText(_friendEmailfield, "mayesha1212@gmail.com");

        // using type text call private class inside the method with sendkey text

        typeText(_personalmessage, "This product is fabulous product and i refer to you.");

        // using click on element call private class inside the method

        clickOnElement(_sendemail);


    }


}
