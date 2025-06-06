package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowshandlesstring2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.cadbury.co.uk/");
		Thread.sleep(3000);
		
		// Opening new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.com/");
		Thread.sleep(3000);

		// new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.morde.com/");
		Thread.sleep(3000);

		// Getting address or IDs of all window/tab
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		//fetching Window Id
		for(String wi : allWindowIDs)
		{
		//switching the control to windows Id	
			driver.switchTo().window(wi);
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			
			Object expectedTitle = null;
			if (actualTitle.equals(expectedTitle))
			{
				break;
			}
		}
		driver.close(); // closing the desired tab/window
	}

}
