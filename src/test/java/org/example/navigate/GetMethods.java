package org.example.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String source = driver.getPageSource();
        System.out.println(url + " " + title + " " + source);
        if (source.contains("en-IN")) {
            System.out.println("it contains in source code");

        } else {
            System.out.println("it not in source code");
        }
        driver.get("https://naukri.com");
        driver.close();
    }
}
