package org.example.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://google.com");
            driver.navigate().to("https://gmail.com");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();


        }}
