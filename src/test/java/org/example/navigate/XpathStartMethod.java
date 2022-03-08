package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/");
        //--------------------START WITH-------------
      if(  driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed()){
          System.out.println("is displayed");
          driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();
      }
    }
}