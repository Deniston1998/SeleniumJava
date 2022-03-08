package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContai {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/");
        //--------------------contact-----------show 3 contact
        driver.findElement(By.xpath("(//a[contains(@href,'contact')])[1]")).click();
//        if(driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).isDisplayed()){
//
//            System.out.println("is displayed ");
//        }
//       // else{
//            System.out.println("not displayed");
//        }
//


    }



}
