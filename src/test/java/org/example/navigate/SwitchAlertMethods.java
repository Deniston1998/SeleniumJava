package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       // driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //***********************to get the value of alert and click ok
      //  String alertMessage =driver.switchTo().alert().getText();
    //    System.out.println(alertMessage);
    //    driver.switchTo().alert().accept();
        //******************************* to get cancel
       // driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
     //   driver.switchTo().alert().dismiss();
        //******************************** to send the data
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hai iam denis");
        driver.switchTo().alert().accept();






}}
