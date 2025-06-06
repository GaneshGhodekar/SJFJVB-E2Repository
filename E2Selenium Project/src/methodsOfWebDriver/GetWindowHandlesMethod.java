package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

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
		
		//Fetching adress/IDs one by one
		for(String wi: allWindowIDs)
		{
			System.out.println(wi);
		Thread.sleep(3000);
		}
		}
	}