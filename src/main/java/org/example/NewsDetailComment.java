package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

// create a public child class with extends parent class
public class NewsDetailComment extends Utils{

    // make a method for user enter new detail comment

    public void userEnterNewsDetailComment() {

        // find locator by id for comment title

        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Its Good shopping website");

        // find locator by class name for comment text
        driver.findElement(By.className("enter-comment-text")).sendKeys("This shopping website is very good they values customer's money&feedback.");

      // click on element using locator by name for add comment
        clickOnElement(By.name("add-comment"));

        // string news comment using locator classname for result gettext

        String newscomment = driver.findElement(By.className("result")).getText();

        // print news comment
        System.out.println(newscomment);

        // using assert for comment successfully added

        Assert.assertEquals("News comment is successfully added.","News comment is successfully added.");


    }
}
