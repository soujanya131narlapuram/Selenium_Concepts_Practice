package com.selenium;

import com.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass extends BaseClass {

    @BeforeTest
    public void init(){

        setUp();
    }
    @Test
            public void robotClassMethods() throws InterruptedException, AWTException {

        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
        driver.manage().window().maximize();

        Robot robot=new Robot();
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); // press left click
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); // release left click
        robot.delay(2500);
        robot.mouseMove(530, 520); // move mouse point to specific location
        robot.delay(3500);
        System.out.println("mouse move");
        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        System.out.println("key board operations");
    }

    @AfterTest
    public void end()
    {
        tearDown();
    }
}
