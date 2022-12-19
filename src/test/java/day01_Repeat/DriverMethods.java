package day01_Repeat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık

        driver.get("https://www.colonist.io");
        System.out.println("Sayfa Basligi: " +driver.getTitle());
        System.out.println("Sayfa Url : "+ driver.getCurrentUrl());
        //System.out.println("Page source kaynak : "+driver.getPageSource());

        System.out.println("Versiyonlar arasi gecis : "+driver.getWindowHandle());
        // Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz




        driver.close();

    }
}
