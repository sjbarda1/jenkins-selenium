package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LoadJenkins {

    private static WebDriver driver;

    @org.junit.BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
        driver.get("Http://www.jenkins-ci.org");
    }

    @org.junit.Test
    public void navigateTo(){
        assertTrue(driver.getTitle().contains("Jenkins"));

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
