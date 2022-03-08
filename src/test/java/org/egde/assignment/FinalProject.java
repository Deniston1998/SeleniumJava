package org.egde.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinalProject {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();

        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
     WebElement landn = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
       WebElement limks = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
        Actions actions = new Actions(driver);

        //       -----------------HOVER------------------
        actions.moveToElement(landn).click(limks).build().perform();
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")).click();
       // driver.findElement(By.xpath("//span[text()='Add to Cart'])[4]")).click();
        System.out.println("adddddddddddddddd toooooooo carrrrrrrrrrrrrttttttttt");

        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        System.out.println("went to           shooooooopppppping");
//      String p1=  driver.findElement(By.xpath("//a[contains(@href,'product_id=44')])[4]")).getText();
//      String p2=  driver.findElement(By.xpath("//a[contains(@href,'product_id=45')])[4]")).getText();
//      if(p1.equals("MacBook Air")){
//          System.out.println("p1 is displayed correctly");
//      }else{
//          System.out.println("p1 is not displayed correctly");
//      }
      driver.findElement(By.xpath("//a[text()='Checkout']")).click();







    }
}