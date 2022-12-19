package day01_Repeat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık

        //colonist sayfasina gidelim. https://www.colonist.io/
        driver.get("https://www.colonist.io");
        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Baslığı : "+driver.getTitle());
        //Sayfa basliginin “Colonist” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Colonist")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sayfa url’inin “colonist” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("colonist")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("Window Handle Değeri : "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");
        //Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak için close() methodu kullanırız
    }
}
