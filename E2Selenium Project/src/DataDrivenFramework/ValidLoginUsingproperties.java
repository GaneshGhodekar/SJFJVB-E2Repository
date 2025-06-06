package DataDrivenFramework;


import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginUsingproperties extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
//		 WebDriver driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Log in")).click();
			
//			FileInputStream fis = new FileInputStream("./testdata/TestData.properties");
//			
//			 Properties prop = new Properties();
//			 prop.load(fis);
//			 String email = prop.getProperty("email");
//			 String password = prop.getProperty("password");
			
			// To create object of Flib class
			Flib flib = new  Flib();
			//Fetching email (Data) from property file using read propertydata method from Flib Class
			 String email = flib.readPropertyData(PROP_PATH,"email");
			//Fetching email (Data) from property file using read propertydata method from Flib Class
			 String password = flib.readPropertyData(PROP_PATH,"password");

			 		 
			 driver.findElement(By.id("Email")).sendKeys(email);
			 Thread.sleep(500);
			 driver.findElement(By.id("Password")).sendKeys(password);
			 Thread.sleep(500);
			 
			 driver.findElement(By.xpath("//input[@value='Log in']")).click();
			 
			  
			 
	}


	}


