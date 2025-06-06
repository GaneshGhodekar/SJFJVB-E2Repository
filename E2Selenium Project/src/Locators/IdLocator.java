package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("Ganesh");
		Thread.sleep(2000);

		WebElement passwordBox = driver.findElement(By.id("Pass"));
		passwordBox.sendKeys("Ganesh@123");
		Thread.sleep(2000);

		
	}

}
