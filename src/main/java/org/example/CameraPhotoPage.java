package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CameraPhotoPage extends Utils {

//    private  By _cameraPhotoPage = By.linkText("Camera & photo");


    public void printProductTitle() {
        // using list webelement by xpath locator

        List<WebElement> productTitle = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
        // using for loop
        for (WebElement e : productTitle) {
            // print product title with the help of gettext
            System.out.println(e.getText());
        }

    }
}
