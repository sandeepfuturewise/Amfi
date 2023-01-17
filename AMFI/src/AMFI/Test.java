package AMFI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	
	public static void main(String[] args) throws InterruptedException {
		test();
	}
		public static void test() throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\new selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
		
	ChromeOptions options= new ChromeOptions();
	options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.amfiindia.com/locate-your-nearest-mutual-fund-distributor-details");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='NearestFinAdvisorsARN']")).sendKeys("5393");

		driver.findElement(By.xpath("//a[@id='hrfGo']")).click();
		Thread.sleep(10000);
		
driver.findElement(By.xpath("//input[@title='Excel']")).click();
driver.findElement(By.xpath("//a[@id='hrfGo']")).click();
Thread.sleep(10000);

driver.findElement(By.xpath("//input[@title='Excel']")).click();
	
		
		//Thread.sleep(4000);
		//driver.close();
		//driver.quit();
		System.out.println("downloaded file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
