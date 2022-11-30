package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.BasePage.driver;

public class SearchProductOnHomePage extends Utils {

//    public void verifyUserIsOnProductPage(String productName){
//        Assert.assertTrue("https://demo.nopcommerce.com/search?q".contains("search?q"));
//
//    }


    public static void eachAndEveryProductHaveProductNameContains(String productName){

        List<WebElement> productItem = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));

        System.out.println(productItem.size());

        for (WebElement element: productItem){
            System.out.println(element.getText());
            Assert.assertTrue(getTextFromElement(By.xpath("//h2[@class=\"product-title\"]")).contains(productName));
        //------

        }




    }



}
