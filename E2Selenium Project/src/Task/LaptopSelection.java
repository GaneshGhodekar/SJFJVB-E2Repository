package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		
		//Finding the Disabled Element & storing it
		//WebElement disableTB = driver.findElement(By.id("tb2"));
		//Thread.sleep(2000); 

		driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(500);



	}

}
