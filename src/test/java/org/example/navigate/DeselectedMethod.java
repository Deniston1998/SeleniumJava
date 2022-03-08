package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectedMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
     WebElement element = driver.findElement(By.name("FromLB"));
        Select select=new Select(element);
        select.selectByValue("USA");
        select.selectByIndex(3);
        select.selectByVisibleText("Italy");
        select.deselectByIndex(3);
        select.deselectByVisibleText("Italy");

    }
}