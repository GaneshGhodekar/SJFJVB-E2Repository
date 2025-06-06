package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(2000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		String emailPrevValue="digvijay@gmail.com";
		
		emailTB.sendKeys(emailPrevValue);
		Thread.sleep(2000);
	    
		String attValue=emailTB.getAttribute("value");
		
		if(attValue.equals(emailPrevValue)) {
			System.out.println("Email is Entered Sucssesfully");
		}
		else {
			System.out.println("Email is Not Entered Correctly");
		}
		
	}
}
