package Frames;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestoneChatBox {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		// for popup
		driver.findElement(By.id("denyBtn")).click();
		//to switch control to frame
		driver.switchTo().frame("fc_widget");
		//to click on chat icon
		driver.findElement(By.id("chat-icon")).click();
		//to switch control back
		driver.switchTo().defaultContent();
		//to pass input
		driver.findElement(By.id("chat-fc-name")).sendKeys("Ganesh");
		
		
	}

}
