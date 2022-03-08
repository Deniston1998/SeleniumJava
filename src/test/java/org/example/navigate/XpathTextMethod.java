package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathTextMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        //-----------------------------USING TEXT-------------------------
        System.out.println("using ttttttttttttttttttteeeeeeeeexxxxxxxxtttttttt");
        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
       String heading= driver.findElement(By.xpath("//h1[text()='Shopping Cart']")).getText();
        System.out.println(heading);

    }
}