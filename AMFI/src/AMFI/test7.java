package AMFI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test7 {
public static void main(String[] args) {

	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\new selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
	
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("headless");
	
	
WebDriver driver=new ChromeDriver(options);
	
	
	driver.get("https://www.amfiindia.com/locate-your-nearest-mutual-fund-distributor-details");
	
driver.manage().window().maximize();

System.out.println(driver.getTitle());
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	

driver.findElement(By.xpath("//input[@name='NearestFinAdvisorsARN']")).sendKeys("95566");
driver.findElement(By.xpath("//a[@id='hrfGo']")).click();


	
	for(int i=1; i<=12; i++)
	{    
	
		if(i==12) {
			String text = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td["+i+"]")).getText();
			
			System.out.print(text+"");
		}
		else {
		String text = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td["+i+"]")).getText();
		
		System.out.print(text+" /");
	
	
		
		}
	

	}}
}

