package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{

    public void verifyUserHasBeenRegisteredSuccessfully() {
        // to verify using method wait for url to be on webpage and its wait until 10 second before that going next page
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 20);


         Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Your registration completed successfully ","Successfully registered");
    }
}
