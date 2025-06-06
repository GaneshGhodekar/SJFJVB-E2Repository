package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/");
					
					driver.findElement(By.linkText("ELECTRONICS")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//img[@alt-'Picture for category cell phones']")).click();
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//img[@alt-'Picture of smartphone']/../../..//input[@value='Add to cart']")).click();
					Thread.sleep(1000);

					driver.findElement(By.xpath("//span[text()='shopping cart']")).click();
					Thread.sleep(1000);

					WebElement cartProduct = driver.findElement(By.xpath("//tu[@class= 'product picture']"));
					
					if(cartProduct.isDisplayed()) {
						System.out.println("Product is added to Cart");
					}
					else {
						System.out.println("Product is not added to cart");
					}
				

					
	}

}
