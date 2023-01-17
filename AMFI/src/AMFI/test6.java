package AMFI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class test6 {

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
			
			
			
			String Srno = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[1]")).getText();
			
			
			System.out.println("SR.NO           :"+Srno);
			
			
			
			String ARN = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[2]")).getText();
			
				
			System.out.println("ARN NUMBER      :"+ARN);
			
			
			String name = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[3]")).getText();
			
			
			System.out.println("ARN HOLDER NAME :"+name);
			
			
			String address= driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[4]")).getText();
			
			
			System.out.println("ADDRESS         :"+address);
			
			
			String PIN = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[5]")).getText();
			
			
			
			System.out.println("PIN             :"+PIN);
			
			
			String email = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[6]")).getText();
			
			
			System.out.println("EMAIL           :"+email);
			
			String city = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[7]")).getText();
			
			System.out.println("CITY            :"+city);
			
			String telephoner = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[8]")).getText();
			
			System.out.println("Telephone R     :"+telephoner);
			
			String telephoneo= driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[9]")).getText();
			
			System.out.println("telephone o     :"+telephoneo);
			
			String till = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[10]")).getText();
			
			
			System.out.println("ARN valid Till  :"+till);
			
			String from= driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[11]")).getText();
			
			
			System.out.println("ARN Valid from  :"+from);
			
			String kyd = driver.findElement(By.xpath("//table[@style='width:1170px;margin-top:5px;table-layout: fixed;overflow: hidden;word-wrap: break-word;']//tr[2]/td[12]")).getText();
			
			System.out.println("KYD Compliant   :"+kyd);
			
			
			
			
		}

	}

