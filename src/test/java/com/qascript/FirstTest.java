package com.qascript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
       	WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertEquals("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


