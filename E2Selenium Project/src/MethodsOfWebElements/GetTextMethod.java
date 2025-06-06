package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement iPhonePrice = driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 256 GB')and contains(text(),'Black')]/../../../..//span[text()='82,900']"));
		System.out.println(iPhonePrice.getText());
	}
}
