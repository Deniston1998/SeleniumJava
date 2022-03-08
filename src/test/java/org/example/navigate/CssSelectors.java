package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        driver.findElement(By.linkText("login page")).click();
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("denis@gmail");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("denis@gmail");
        driver.findElement(By.cssSelector("input[value='Login'")).click();


    }
}