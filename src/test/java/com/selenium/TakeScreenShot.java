package com.selenium;

import com.selenium.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot extends BaseClass {

    @BeforeTest
    public void init(){

        setUp();
    }
    @Test
public void takeScreenshot() throws IOException {
        driver.get("https://demoqa.com/automation-practice-form");

       driver.manage().window().maximize();
        TakesScreenshot scrShot =((TakesScreenshot) driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\ANIL\\AppData\\Local\\Temp\\WebDriverInterface_Selenium\\src\\main\\ScreenShots\\pic.png");
        FileHandler.copy(SrcFile,dest);
    }
    @Test
    public void specificScreenshot() throws IOException {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement date_of_birth=driver.findElement(By.id("userEmail"));
        File SrcFile=date_of_birth.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\ANIL\\AppData\\Local\\Temp\\WebDriverInterface_Selenium\\src\\main\\ScreenShots\\pic2.png");
        FileHandler.copy(SrcFile,dest);
        System.out.println("specific area screenshot");
    }
    @AfterTest
    public void end()
    {
        tearDown();
    }
}
