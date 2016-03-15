package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoadYahoo {

    private static WebDriver driver;

    @org.junit.BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
        driver.get("Http://www.yahoo.com");
    }

    @org.junit.Test
    public void navigateTo(){
        assertThat(driver.getTitle(), is("Yahoo"));

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
    }

    @org.junit.AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}