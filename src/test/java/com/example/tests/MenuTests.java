package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class MenuTests extends BaseTest {
    @Test
    public void testMenuButtonClick() {
        WebElement menuButton = driver.findElement(By.id("menuButton"));
        menuButton.click();
        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenu"));
        Assert.assertTrue("Dropdown menu should be visible", dropdownMenu.isDisplayed());
    }
}
