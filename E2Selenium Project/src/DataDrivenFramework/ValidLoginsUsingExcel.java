package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
public class ValidLoginsUsingExcel extends BaseTest { 

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);

		driver.findElement(By.linkText("Log in")).click();

		// Creating the Object of Flib class to access the method to read data from Excel File
		Flib flib = new Flib();

		// To Read email(data) from Excel file
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);

		// To read password(data) from Excel file
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);

		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
	}

}
