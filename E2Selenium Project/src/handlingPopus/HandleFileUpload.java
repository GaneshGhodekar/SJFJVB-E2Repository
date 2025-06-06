package handlingPopus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
 		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement fileuploadButton = driver.findElement(By.id("uploadfile"));
		
		Actions act = new Actions(driver);
	act.click(fileuploadButton).perform();
		act.moveToElement(fileuploadButton).click().perform();
		
//	fileuploadButton.sendKeys("C:\\Users\\HP\\Downloads\\PPR_34785791.pdf");

	}

}
