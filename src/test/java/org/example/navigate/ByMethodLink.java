package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ByMethodLink {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        /////////--------------------using link ------------------a tag-------
        driver.findElement(By.linkText("login page")).click();
        if(driver.findElement(By.linkText("Login")).isDisplayed()){
            System.out.println("is displayed");

        }
        else {
            System.out.println("not displayed");
        }
//---------------------list the button tag-------------------------------
     List<WebElement> tags =  driver.findElements(By.tagName("button"));
        for(WebElement a:tags){
            System.out.println(a.getText());
        }
    }
}