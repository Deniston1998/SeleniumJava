package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLogicAndOr {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        //-----------------------------AND OPERATOR----------------------------------
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary' or text()='Continue']")).click();
    }
}