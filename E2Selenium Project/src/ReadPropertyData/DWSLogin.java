package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		

		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		//To specify the path of file
		FileInputStream fis = new FileInputStream("./testData/TestData.properties");
		
		
		//creating object of properties class to access load()
		Properties prop = new Properties();
		
		//TO load specified file or make the file ready to read
		prop.load(fis);
		
		
		//To read email (data) from property file
		String email = prop.getProperty("email");
				
		//To read password (data) from property file
		
		String pwd = prop.getProperty("password");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
