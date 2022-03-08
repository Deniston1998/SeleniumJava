package org.example.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThreadSleep {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/test/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://gmail.com");
    }
}