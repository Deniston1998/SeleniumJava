package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRadioIndex {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        //------------------------Radio Button
        driver.findElement(By.xpath("//(input[@name-'newsletter'])[1]")).click();
       // driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
    }
}