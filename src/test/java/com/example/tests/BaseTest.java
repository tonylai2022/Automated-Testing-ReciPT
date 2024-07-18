package com.example.tests;

import com.example.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    protected WebDriver driver;
    private WebDriverManager webDriverManager;

    @Before
    public void setUp() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        driver.get("https://two800-2024410-dtc08.onrender.com/"); // Navigate to the provided URL
    }

    @After
    public void tearDown() {
        webDriverManager.quitDriver();
    }
}
