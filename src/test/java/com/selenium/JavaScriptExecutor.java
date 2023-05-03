package com.selenium;

import com.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.awt.SystemColor.window;

public class JavaScriptExecutor extends BaseClass {
    @BeforeTest
    public void init(){

        setUp();
    }
    @Test
    public void javascript_Executor() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        System.out.println("scroll down using javascript..................................");
        Thread.sleep(1000);
        WebElement ele=driver.findElement(By.xpath("//label[@id='stateCity-label']"));


        js.executeScript("arguments[0].scrollIntoView();",ele);
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(250,0)");
        System.out.println("mission success");



    }
    @AfterTest
    public void end()
    {
        tearDown();
    }
}
