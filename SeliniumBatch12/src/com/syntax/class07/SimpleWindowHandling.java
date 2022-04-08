package com.syntax.class07.Class07Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url="http://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Creating instantiate  of objects and variables the driver
        WebDriver driver=new ChromeDriver();
        //launching  a web browser
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle(); //it will return String type ==ID for current type
        System.out.println(mainPageHandle);
        //whenever you open new page, you wll have new ID


        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandles=driver.getWindowHandles();//store all the handles in a set
        System.out.println(allWindowHandles.size());
        Iterator<String> it= allWindowHandles.iterator();// have an iterator in order to iterate through handles
        mainPageHandle=it.next(); //take the first step and assign the main handle
        String childHandle=it.next(); //take second step and have a child handle //when color is grey it means we do not use anywhere
        System.out.println(childHandle);
        Thread.sleep(2000);

        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle); //to specify page in order to handle

        Thread.sleep(2000);
      helpLink.click();



    }
}
