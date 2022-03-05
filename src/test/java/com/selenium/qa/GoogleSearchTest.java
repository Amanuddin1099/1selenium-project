package com.selenium.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {

    @Test
    public void googleSearchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\My Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Bangladesh");
        Thread.sleep(1000);
//        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.name("btnK")).submit();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

    }






}
