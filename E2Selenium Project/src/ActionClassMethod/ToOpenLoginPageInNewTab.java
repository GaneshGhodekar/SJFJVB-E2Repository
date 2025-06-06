package ActionClassMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageInNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);

		String expectedTitle = "Demo Web Shop. Login";

		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		Thread.sleep(1000);

		// fetching address /handle of parent tab
		String parentWindowHandle = driver.getWindowHandle();
		// creating object of action classs
		Actions act = new Actions(driver);

		// to press control button & click on login link
		act.keyDown(Keys.CONTROL).click(loginlink).perform();
		Thread.sleep(500);

		//to release control button
		act.keyUp(Keys.CONTROL).perform();
		
		//fetching adress/handles of all the tab
		Set<String> allWindows = driver.getWindowHandles();
		
		// to remove adress of parent tab
		allWindows.remove(parentWindowHandle);

		for (String wi : allWindows) {
			//to switch control to new tab
			driver.switchTo().window(wi);
			//to fetch title of current page
			String actualTitle = driver.getTitle();
			
			//to compare & match title
			if(actualTitle.equals(expectedTitle))
			{
				break; // to breakthe loop if title is matched
			}
		}
		
		//to find email textbox present on tab & pass input
			driver.findElement(By.id("Email")).sendKeys("ganeshghodekar@gmail.com");
			
		}

	

}
