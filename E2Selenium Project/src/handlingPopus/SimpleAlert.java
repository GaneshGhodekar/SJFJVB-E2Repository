package handlingPopus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {

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
		driver.findElement(By.id("alert1")).click();

		// to switch control to alert popup
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);

		// to print text present in popup
		System.out.println(simpleAlert.getText());

		// to click on OK button
		// simpleAlert.accept();

		simpleAlert.dismiss();

	 }

}
