package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator1 {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///F:/Selenium%20Work%20in%20class/Web%20Elements/Gender.html");
			
			driver.findElement(By.name("gender")).click();
	}

}
