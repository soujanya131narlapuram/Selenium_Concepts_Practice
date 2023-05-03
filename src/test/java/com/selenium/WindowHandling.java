package com.selenium;

import com.selenium.base.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
    }
    @Test
    public void handlingMthds() {

        driver.get("http://www.naukri.com/");

        // It will return the parent window name as a String
        String parent_window = driver.getWindowHandle();
        System.out.println("parent window" +parent_window);

        Set<String> s = driver.getWindowHandles();

        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

            System.out.println("child window:"+child_window);
            if (!parent_window.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
        //switch to the parent window
        driver.switchTo().window(parent_window);

    }

    @AfterTest
    public void end(){
        tearDown();
    }
}
