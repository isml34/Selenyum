package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");


        // Search bolumunde Iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
//        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//        aramaKutusu.sendKeys("Iphone", Keys.ENTER);#


        // Arama sonuç yazısında iphone yazısını locate edip konsola yazdıralım
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        // Sayfayi kapatalim.
        driver.close();


    }
}
