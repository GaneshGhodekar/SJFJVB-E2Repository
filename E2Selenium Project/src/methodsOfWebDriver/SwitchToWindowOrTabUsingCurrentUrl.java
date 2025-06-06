package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowOrTabUsingCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.titan.co.in/");
		    Thread.sleep(1000);
		    
		    // Opening new tab
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.fossil.com/en-in/");
			Thread.sleep(3000);
			String expectedUrl="https://www.fossil.com/en-in/";
			
			//Opening new window & Fastrack
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.fastrack.in/");
			Thread.sleep(2000);
			
			//Capturing handles
			Set<String> allWindowIDs = driver.getWindowHandles();
			
			//Iterating to Id's Using Each loop
			
			for(String wi : allWindowIDs)
					{
						//Switching control to particular window
						driver.switchTo().window(wi);
						
						//Fetching actual Url
						String actualUrl = driver.getCurrentUrl();
						
						// Comparing actualUrl with Expected Url
						if (actualUrl.equals(expectedUrl))
						{
							break;	
						}
					}
	
					// Closing the window/tab where driver Control is present
					driver.close();
					Thread.sleep(3000);

					
					//Closing all Windows/Tabs as well as destroying the driver file
					driver.quit();
	

}
	
}
