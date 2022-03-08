package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FinElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //list all the web elements with tag a-------------------------------------
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        for (WebElement e:allLinks){
            System.out.println(e.getText());
        }

    }
}