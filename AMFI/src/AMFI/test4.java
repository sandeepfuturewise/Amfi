package AMFI;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\new selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amfiindia.com/locate-your-nearest-mutual-fund-distributor-details");
		
	driver.manage().window().maximize();	
		
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='NearestFinAdvisorsARN']")).sendKeys("95566");
	driver.findElement(By.xpath("//a[@id='hrfGo']")).click();
	List<WebElement> list = driver.findElements(By.tagName("table"));
		
	for(WebElement data:list)
	 {
	String amfidata = data.getText();
		
	System.out.print(amfidata);
	 }
	driver.close();
	driver.quit();
	}
}
