package com.selenium;

import com.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class IframeHandling extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
    }
    @Test
    public void frameHandlingMethods()
    {
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID
        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        System.out.println("*********We are done***************");
        List<WebElement> allFrames=driver.findElements(By.xpath("//iframe"));
        int totalFrames=allFrames.size();
        System.out.println("no of frames:"+totalFrames);
        for(int i=0;i<totalFrames; i++){
            System.out.println("page source "+i+":"+driver.switchTo().frame(i).getPageSource());

   }
}
    @Test
        public void frameHandling_Action()
    {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Actions actions=new Actions((driver));
        List<WebElement> allFrames=driver.findElements(By.xpath("//iframe"));
        int totalFrames=allFrames.size();
        System.out.println("no of frames:"+totalFrames);
        for(int i=0;i<totalFrames; i++){
            driver.switchTo().frame(0);
            WebElement dragElement=driver.findElement(By.id("draggable"));
            WebElement dropElement=driver.findElement(By.id("droppable"));
            actions.dragAndDrop(dragElement,dropElement).build().perform();
            System.out.println("title .....:"+driver.findElement(By.tagName("title")).getAttribute("entry-title"));
    }}
        @Test
        public void actionsClass() {
            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();
            Actions action = new Actions((driver));
            WebElement name = driver.findElement(By.id("firstName"));
            action.moveToElement(name)
                    .click()
                    .keyDown(name, Keys.SHIFT)
                    .sendKeys("selenium")
                    .keyUp(name, Keys.SHIFT)
                    .doubleClick(name)
                    .build().perform();
        }
        @Test
                public void scrolling() throws InterruptedException {
            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();
            Actions action = new Actions((driver));
            action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
            Thread.sleep(1000);
            action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();


    }
    @AfterTest
    public void end(){
        tearDown();
    }
}
