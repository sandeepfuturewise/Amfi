package AMFI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\new selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amfiindia.com/locate-your-nearest-mutual-fund-distributor-details");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        for (int j = 11111; j <= 99999; j++) {
            driver.findElement(By.xpath("//input[@name='NearestFinAdvisorsARN']")).sendKeys(Integer.toString(j));
            driver.findElement(By.xpath("//a[@id='hrfGo']")).click();
            for (int i = 1; i <= 12; i++) {
                String text = driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[2]/td[" + i + "]")).getText();
                if (i != 12) {
                    System.out.print(text + " /");
                } else {
                    System.out.println(text);
                }
            }
        }
    }
}
