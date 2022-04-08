package com.syntax.class07.Class07Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

        public static String url="https://syntaxprojects.com/window-popup-modal-demo.php";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            //Creating instantiate  of objects and variables the driver
            WebDriver driver = new ChromeDriver();
            //launching  a web browser
            driver.get(url);
            String mainPageHandle = driver.getWindowHandle();

            WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
            WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
            WebElement instagramAndFBButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
            instagramAndFBButton.click();

            fbButton.click();

            instagramButton.click();

            Set<String> allWindowHandles = driver.getWindowHandles();
            System.out.println(allWindowHandles.size());

            Iterator<String> iterator = allWindowHandles.iterator();
            while (iterator.hasNext()) { //start iterating through the handles
                String handle = iterator.next();//get the next handle
                if (!mainPageHandle.equals((handle))) { //set a condition
                    driver.switchTo().window(handle);// swithc a window which is not equal to main page hand;e
                    driver.manage().window().maximize(); //after switch(); we can maximize all windows
                    String title = driver.getTitle();
                    System.out.println(title);
                    driver.close();
                }
            }
                  driver.switchTo().window(mainPageHandle); //switching back to parent handle
                      instagramButton.click();
        }}
