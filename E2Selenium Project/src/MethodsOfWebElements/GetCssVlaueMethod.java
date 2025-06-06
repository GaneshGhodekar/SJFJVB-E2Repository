package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssVlaueMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(2000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
				
		emailTB.sendKeys("abcd", Keys.ENTER);
		Thread.sleep(2000);
		WebElement errorMassage=driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
	    
		String color= errorMassage.getCssValue("color");
		System.out.println(color);
		
	}
		
	
}
