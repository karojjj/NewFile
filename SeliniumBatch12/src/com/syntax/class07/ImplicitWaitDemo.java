package com.syntax.class07.Class07Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static String url = "https://syntaxprojects.com/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Creating instantiate  of objects and variables the driver
        WebDriver driver = new ChromeDriver();
        //launching  a web browser
        driver.get(url);
        //best practice is to write it right after get url
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement startPracticingButton=driver.findElement(By.id("btn_basic_example11111"));
        startPracticingButton.click();

       // WebElement nextElement= driver.findElement();
    }
}