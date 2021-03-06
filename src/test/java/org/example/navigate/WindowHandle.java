package org.example.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://naukri.com");
        String mainWindow=driver.getWindowHandle();
        System.out.println(mainWindow);
        //---------------------------------print main window id-----------------------------------
        Set<String> handles= driver.getWindowHandles();
        int noofwin = driver.getWindowHandles().size();
        System.out.println(noofwin);
        for(String handle:handles){
            if(!mainWindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }

        }
        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Automation  testing");
        driver.findElement(By.xpath("//button[text()='Search']")).click();

}}
