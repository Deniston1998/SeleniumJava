package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
       // driver.findElement(By.id("item_4_title_link")).click();
        System.out.println("hai");

        String text =  driver.findElement(By.xpath("(//span[@class='title])")).getText();
        System.out.println(text);
        driver.quit();
     if(text.equals("Products")) {
         System.out.println("text is matching");
     }else{
             System.out.println("text is not matchoing");
         }
        System.out.println("hellollllllll");
        String tag= driver.findElement(By.id("item_4_img_link")).getTagName();
        System.out.println(tag);
     if(tag.equals("a")){
         System.out.println("correct tag");
     }else {
         System.out.println("wrong tag");
     }



    }

}

