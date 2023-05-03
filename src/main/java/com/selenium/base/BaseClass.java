package com.selenium.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
    public WebDriver driver;

    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
    }

    public void tearDown(){
        driver.close();
    }
}
