package com.selenium;


import com.selenium.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
    }
@Test
    public void locators() throws InterruptedException {
    driver.get("https://demoqa.com/automation-practice-form");
    driver.findElement(By.id("firstName")).sendKeys("jesus");
    System.out.println("id locator");
    driver.findElement(By.id("lastName")).sendKeys("jesuslord");
    System.out.println("id locator");
    driver.findElement(By.id("userEmail")).sendKeys("jesuslord@gmail.com");
    System.out.println("id locator");

    driver.findElement(By.id("userNumber")).sendKeys("87987986129");
    System.out.println("id locator");

    driver.findElement(By.name("gender"));

    System.out.println("name locator..........");
    driver.findElement(By.className("practice-form-wrapper"));

    System.out.println("class name locator..........");
    driver.findElement(By.className("header-text")).click();
    Thread.sleep(1000);
    driver.findElement(By.tagName("a"));
    System.out.println("tagname locator");
    driver.findElement(By.cssSelector("input[id=userEmail]")).sendKeys("soujanya@gmail.com");
    driver.findElement(By.cssSelector(".custom-control")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id^=first]")).sendKeys("sravan");
    Thread.sleep(1000);

    driver.findElement(By.cssSelector("input[id$=Name]")).sendKeys("ashok");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id*=stNam]")).sendKeys("ramesh");
    System.out.println("css selector");
    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("manichandra");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("98739162761");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='uploadPicture']"));
    System.out.println("xpath locator");
}
@Test
        public void partialLinkText_LinkText() {
            driver.get("http://demo.guru99.com/test/accessing-link.html");
            driver.findElement(By.partialLinkText("here")).click();
            System.out.println("Title of page is: " + driver.getTitle());

            driver.get("https://www.tutorialspoint.com/mobile_testing/index.htm");
            driver.findElement(By.linkText("PDF Version")).click();
            System.out.println("title of page is: " + driver.getTitle());
            driver.findElement(By.linkText("Mobile Testing - Home")).click();
            System.out.println("title of page is: " + driver.getTitle());

            driver.get("https://www.tutorialspoint.com/mobile_testing/mobile_testing_overview.htm");
            driver.findElement(By.partialLinkText("Testing ")).click();
            System.out.println("Title of page is: " + driver.getTitle());
    }



    @AfterTest
    public void end()
    {
        tearDown();
    }
    }


