package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsEndsAnyCssLocator {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Log in")).click();
			
			driver.findElement(By.cssSelector("input[name^='Em']")).sendKeys("xyz@gmail.com");
			
			driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("9923");
			
			driver.findElement(By.cssSelector("input[value*=g i")).click();

			
	}

}
