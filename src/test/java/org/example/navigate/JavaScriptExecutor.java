package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement btnlogin=driver.findElement(By.id("login-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",btnlogin);
      //  js.executeScript("alert('welcome to selenium');");
        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);
        String url = js.executeScript("return document.URL;").toString();
        System.out.println(url);
        js.executeScript("window.scrollBy(0,600)");





    }
}