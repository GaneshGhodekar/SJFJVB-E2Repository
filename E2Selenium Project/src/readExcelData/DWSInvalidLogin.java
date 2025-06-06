package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSInvalidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/"); 
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();

		FileInputStream fis1 = new FileInputStream("./testData/TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("invalidcreds");
		int rc = sheet1.getLastRowNum();
		
		for(int i=1;i<=rc; i++)
		{
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String email = cell.toString(); 		
		Cell cell1 = row.getCell(1);
		String password = cell1.toString();
		
		

		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);


		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		
		
		
		
		
		
		
		
		
		}
	}

}
