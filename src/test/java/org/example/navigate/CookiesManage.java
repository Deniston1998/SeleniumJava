package org.example.navigate;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesManage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/");
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies);
        // get named cookie
        Cookie currentCookie=driver.manage().getCookieNamed("currency");
        System.out.println(currentCookie);
        //to add custom cookie
        Cookie customCookie=new Cookie("user","tester");
        driver.manage().addCookie(customCookie);
        System.out.println(
                driver.manage().getCookieNamed("user"));
        // to delete specific cookie
        driver.manage().deleteCookie(customCookie);
        driver.manage().deleteCookieNamed("currency");
        Set<Cookie> cookies1=driver.manage().getCookies();
        System.out.println(cookies1);
        //delete all cookie
        //driver.manage().deleteAllCookies();



    }
}