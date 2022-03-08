package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OptionMethods {
// ********************************This method is used to list the data in dropdomn menu***************
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select=new Select(element);
        select.selectByIndex(4);
        select.selectByIndex(3);
        select.selectByIndex(2);

       List<WebElement> options= select.getOptions();
        //***************list is a collection strore objects**********
        System.out.println("all the dropdown option");
        for(WebElement e: options){
            System.out.println(e.getText());
        }
        System.out.println("first selected dropdown option");
       WebElement firstSelectedOption= select.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());
        System.out.println("print selected dropdown option");
        List<WebElement> selectedOptions=   select.getAllSelectedOptions();
        for(WebElement e: selectedOptions){
            System.out.println(e.getText());
        }

    }
}