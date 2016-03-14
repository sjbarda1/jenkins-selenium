package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoadBing {

    private WebDriver driver;

    @BeforeClass
    public void createDriver(){
        driver = new FirefoxDriver();
        driver.get("Http://www.bing.com");
    }

    @Test
    public void navigateTo(){

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}