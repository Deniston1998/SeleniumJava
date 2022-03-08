package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEleme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
       WebElement element= driver.findElement(By.name("btnK"));
     //  WebElement ele=driver.findElement(By.xpath("//input[@class='gNO89b']"))"));
       if(element.isEnabled()){
           System.out.println("is displayed");
       }
       else {
           System.out.println("not displayed");
       }
    driver.close();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }


}