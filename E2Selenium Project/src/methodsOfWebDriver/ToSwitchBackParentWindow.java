package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackParentWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(3000);
		
		//capturing id of new window
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(3000);

		//Opening a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.phonepe.com/");
		Thread.sleep(3000);
		
		//Opening a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);

		//Switching to main window by using window ID of main Window.class
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(3000);

		//Closing the main window where control is switching/parent
		driver.close();


		
		
	}

}
