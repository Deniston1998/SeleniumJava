package org.example.navigate;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        Point point=driver.manage().window().getPosition();
        System.out.println(point.x);
        System.out.println(point.y);

        Point pint2= new Point(30,30);
        driver.manage().window().setPosition(pint2);

        Dimension dimension=new Dimension(300,500);
        driver.manage().window().setSize(dimension);

    }
}