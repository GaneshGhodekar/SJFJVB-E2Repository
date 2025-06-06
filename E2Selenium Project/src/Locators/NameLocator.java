package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("ganeshghodekar@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("pass")).sendKeys("9923797142");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		
	}

}
