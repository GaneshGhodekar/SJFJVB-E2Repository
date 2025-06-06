package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForPartialLinkText {

	public static void main(String[] args) {
//https://www.suzukimotorcycle.co.in/product-details/hayabusa
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		
		driver.findElement(By.partialLinkText("ACCESSORIES")).click();
	}

}
