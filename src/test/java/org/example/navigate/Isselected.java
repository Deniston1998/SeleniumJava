package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        if(driver.findElement(By.name("newsletter")).isDisplayed()){
            if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();


        }

    }
        if(driver.findElement(By.name("agree")).isDisplayed()){
            driver.findElement(By.xpath("(//input[@name='agree'])[1]")).click();
        }
    }
}