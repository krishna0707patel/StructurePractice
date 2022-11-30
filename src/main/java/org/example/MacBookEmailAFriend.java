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

        typeText(_friendEmailfield, LoadProp.getProperty("friendemailpart1") + getTimeStamp() + LoadProp.getProperty("friendemailpart2"));

        // using type text call private class inside the method with sendkey text

        typeText(_personalmessage, LoadProp.getProperty("personalmessagemacbook"));
        // using click on element call private class inside the method

        clickOnElement(_sendemail);


    }


}
