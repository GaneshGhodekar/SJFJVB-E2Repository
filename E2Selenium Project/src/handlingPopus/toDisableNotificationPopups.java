package handlingPopus;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class toDisableNotificationPopups {

	public static void main(String[] args) throws InterruptedException {
		
		//creating object of ChromeOptions class
		ChromeOptions co = new ChromeOptions();
		//to disable the notification popups
		co.addArguments("--disable-notifications");
		// creating object of ChromeDriver & passing the reference of ChromeOptions to disable the notification popup
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		// declaring explicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring implicit wait

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://www.easemytrip.com/");
	}

}
