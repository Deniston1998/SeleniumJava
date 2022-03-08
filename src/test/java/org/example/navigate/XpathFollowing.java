package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowing {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        //-----------------------------LAST NAME---------------
       //------------------------------following
        driver.findElement(By.xpath("//input[@id='input-firstname']//following::input[1]")).sendKeys("Deniston");
       //-------------------------ancestral--------------------

       driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();

        //-------------------sibling
     driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();

     //driver.navigate().refresh();
        //-----------parent-----
      // String tex= driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();
      //  System.out.println(tex);
        //--descendant----------------------------------------
        driver.findElement(By.xpath("//div[@id='account-register']//descendant::input[4]")).sendKeys("denis@sjsj");

    }
}