package AMFI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\new selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amfiindia.com/locate-your-nearest-mutual-fund-distributor-details");
		
		
		driver.findElement(By.xpath("//input[@name='NearestFinAdvisorsARN']")).sendKeys("5393");

		driver.findElement(By.xpath("//a[@id='hrfGo']")).click();
		
		driver.findElement(By.xpath("//input[@title='Excel']")).click();
		
		
		//Thread.sleep(4000);
	//driver.close();
	
	Thread.sleep(3000);
	FileInputStream file =new FileInputStream("C:\\Users\\HP\\Downloads\\AMFI_Reports (1).xls");
	
	
	
	 Workbook book  = WorkbookFactory.create(file);
	
	Sheet sh = book.getSheet("AMFI_Reports (1)");
	
	
	Row rw = sh.getRow(2);
	
	Cell cl = rw.getCell(3);
	
	 String value = cl.getStringCellValue();
	
	System.out.println(value);
	
	}
	
	
}
