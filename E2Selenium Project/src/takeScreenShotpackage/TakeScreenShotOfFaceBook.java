package takeScreenShotpackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfFaceBook {

	public static void main(String[] args) throws IOException {
		String dateTime = LocalDateTime.now().toString();
	String timeStamp =	dateTime.replaceAll(":", "-");
	
		
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			//step1-typecasting driver ref in Takescreenshot type
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			//step2- Capturing the screenshot using getscreenshotAs
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			//step3- creating new file to specify the path,name & extension to store screenshot
			File dest = new File("./Screenshots/facebook"+timeStamp+".png");
			
			//step4- Copying & storing screenshot by using copy() of FileHandler class
			FileHandler.copy(src, dest); 
	}

}
