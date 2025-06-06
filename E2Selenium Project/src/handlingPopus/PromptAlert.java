package handlingPopus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring explicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring implicit wait

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://omayo.blogspot.com/");

		// to get alert popup
		driver.findElement(By.id("prompt")).click();
		
		//to switch control to alert popup
		Alert promptAlert = driver.switchTo().alert();
		
		//to get text present inside the popup
		System.out.println(promptAlert.getText());
		Thread.sleep(2000);
		
		promptAlert.sendKeys("Ganesh");
		Thread.sleep(500);
		
		//to accept or click on "OK" button
		//confirmationAlert.accept();
		 
		//to cancel or click on cancel button
		promptAlert.dismiss();
	}

	
		
	}


