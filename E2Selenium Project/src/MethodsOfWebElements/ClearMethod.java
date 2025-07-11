package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(2000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		emailTB.sendKeys("gtg@gmail.com",Keys.TAB,"Admin@123");
		Thread.sleep(2000);
		emailTB.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);

		emailTB.clear();
		Thread.sleep(2000);
		
		emailTB.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		emailTB.clear();

	}

}
