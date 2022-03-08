package org.egde.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/test/drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        if(title.equals("Gmail")){
            System.out.println("The title is coorect");
        }
        else {
            System.out.println("The title is wrong");
        }
}
}
