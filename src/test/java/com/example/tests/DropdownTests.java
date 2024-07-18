package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class DropdownTests extends BaseTest {
    @Test
    public void testNavigateDropdownMenu() {
        WebElement menuButton = driver.findElement(By.id("menuButton"));
        menuButton.click();
        WebElement signUpLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signUpLink.click();
        Assert.assertTrue("Sign Up page should be loaded", driver.getCurrentUrl().contains("/signup"));
    }
}
