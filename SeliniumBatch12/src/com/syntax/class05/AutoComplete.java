package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitPractice2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address= driver.findElement(By.id("autocomplete"));
        address.sendKeys("440 sea street ");

        WebElement streetAddress=driver.findElement(By.id("street_number"));
        address.sendKeys("apt 3");

        WebElement city= driver.findElement(By.id("locality"));
        city.sendKeys("Boston");

        WebElement zipCode= driver.findElement(By.id("postal_code"));
        zipCode.sendKeys("02119");

        WebElement country= driver.findElement(By.id("country"));
        country.sendKeys("turkey");

    }
}
