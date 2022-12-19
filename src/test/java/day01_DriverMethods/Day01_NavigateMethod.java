package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //Hepsiburada sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        //Tekrar hepsiburada sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Ve sayfayı kapatalım
        driver.close();
    }
}
