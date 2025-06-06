package Frames;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11ExampleForFrames {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);

		// To Switch to the frame by using the index of frame.
		// driver.switchTo().frame(0);

		// To Switch to the frame by using the value of name or id attribute.
		// driver.switchTo().frame("send-sms-iframe");
		
		// To Switch to the frame by using the value of name or id attribute.
				 WebElement frmaeElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
				
				 //by using xpath
				 driver.switchTo().frame(frmaeElement);
				 

		driver.findElement(By.id("regEmail")).sendKeys("2222222222222");
		
		
		//to switch control one frame back
		//driver.switchTo().parentFrame();
		
		//switching out of all frames
		driver.switchTo().defaultContent();
		
		//to verify if the control has switched back to main webpage
		driver.findElement(By.id("select-selected")).click();
	}

}
