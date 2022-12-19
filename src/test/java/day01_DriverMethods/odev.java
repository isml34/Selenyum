package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık


        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com");
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();

        //2 soru
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin

        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("Sayifanin boyutlari " +driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().maximize();
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("Sayifanin boyutlari " +driver.manage().window().getSize());

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //Sayfayi kapatin
        driver.close();
    }
}
