package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class FormTests extends BaseTest {
    @Test
    public void testSignUpButtonClick() {
        WebElement signUpButton = driver.findElement(By.id("signUpBtn"));
        signUpButton.click();
        Assert.assertTrue("Sign Up page should be loaded", driver.getCurrentUrl().contains("/signup"));
    }
}
