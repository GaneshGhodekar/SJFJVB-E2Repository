package takeScreenShotpackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		String dateTime = LocalDateTime.now().toString();
	String timeStamp =	dateTime.replaceAll(":", "-");
	
		
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			//st1-locating webelement & storing
			
			WebElement loginButton = driver.findElement(By.name("login"));
			
			//st2- capturing screenshot of WE by accessing getscreenshotAs() throgh ref
			
			File src = loginButton.getScreenshotAs(OutputType.FILE);
			
			//st3- creating new file & specifying path, name& extensions 
			File dest = new File("./Screenshots/FBloginButton"+timeStamp+".png");
			
			//st4- storing screenshot by using copy() of files from  com.google.common.io.package;

			Files.copy(src, dest);
	}

}
