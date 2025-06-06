package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class InvalidLoginUsingExcel extends BaseTest
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
//		 WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.get("https://demowebshop.tricentis.com/");
		
		 
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Log in")).click();
			
			Flib flib = new Flib();
			int rc = flib.getLastRowCount(EXCEL_PATH,INVALIDCREDS);
			
			for (int i = 1; i<=rc; i++)
			{
				String email = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
				Thread.sleep(500);
				
				String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
				Thread.sleep(500);
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
