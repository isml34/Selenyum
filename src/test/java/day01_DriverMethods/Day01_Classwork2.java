package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Classwork2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//mutlaka yap

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED -->"+ actualTitle);
        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("facebook")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED" + actualUrl);
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Browser’i kapatin
        driver.close();
    }
}

