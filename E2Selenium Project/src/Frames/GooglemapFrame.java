package Frames;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglemapFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		// To Switch to the frame by using the index of frame.
		// driver.switchTo().frame(0);

		// To Switch to the frame by using the value of name or id attribute.
		// driver.switchTo().frame("send-sms-iframe");

		// To Switch to the frame by using the value of name or id attribute.
		// WebElement frmaeElement =

		// by using xpath
		//driver.switchTo().frame(frmaeElement);

		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();   //bluestone jwellery task for hw-->you have to click on chatbox-->pass name
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Gmail")).click();
		//driver.switchTo().defaultContent();
		
		
	}

}
