package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("item_4_title_link")).click();




}}
