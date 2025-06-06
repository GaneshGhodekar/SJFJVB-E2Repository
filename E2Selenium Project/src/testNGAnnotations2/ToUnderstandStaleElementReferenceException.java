package testNGAnnotations2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		emailTB.sendKeys("ganeshghodekar@gmail.com");
		Thread.sleep(1000);

		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.sendKeys("Ganesh@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		
		
		
		
		
	}

}
