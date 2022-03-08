package org.egde.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Santhosh ");
        driver.findElement(By.id("input-lastname")).sendKeys("Deniston ");
        driver.findElement(By.id("input-email")).sendKeys("denistonsf19918@gmail.com ");
        driver.findElement(By.id("input-telephone")).sendKeys("8930984578");
        driver.findElement(By.id("input-password")).sendKeys("Deniston@12345");
        driver.findElement(By.id("input-confirm")).sendKeys("Deniston@12345");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();

        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
       String text= driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
        System.out.println(text);








    }
}