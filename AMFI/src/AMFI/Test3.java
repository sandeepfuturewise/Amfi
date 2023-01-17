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

public class Test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file =new FileInputStream("Downloads\\09 July Group E mock Result_1109.xlsx");
		
		
		 Workbook book  = WorkbookFactory.create(file);
		
		 Sheet sh = book.getSheet("Sheet2");
			
		 Row rw = sh.getRow(8);
			
			Cell cl = rw.getCell(2);
			
			 String value = cl.getStringCellValue();
			
			System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
