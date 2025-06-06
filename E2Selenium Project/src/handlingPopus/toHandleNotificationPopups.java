package handlingPopus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class toHandleNotificationPopups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
 		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		
		//creating object of robot class
		Robot robot = new Robot();
		
		//to press tab key
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		
		//to release tab key
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//to press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//to release enter key
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
