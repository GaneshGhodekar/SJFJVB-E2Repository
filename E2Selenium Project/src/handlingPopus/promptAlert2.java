package handlingPopus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class promptAlert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring explicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring implicit wait

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		// to get alert popup
		driver.findElement(By.id("buttonAlert1")).click();
		
		//to switch control to alert popup
		Alert promptAlert = driver.switchTo().alert();
		
		//to get text present inside the popup
		System.out.println(promptAlert.getText());
		Thread.sleep(2000);
		
		promptAlert.sendKeys("yes");
		Thread.sleep(500);
		
		//to accept or click on "OK" button
		//promptAlert.accept();
		//to cancel or click on cancel button
		promptAlert.dismiss();
	}

}
