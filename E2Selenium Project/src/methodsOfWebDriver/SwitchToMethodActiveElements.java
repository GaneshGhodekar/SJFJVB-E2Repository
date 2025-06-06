package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethodActiveElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();  // to launch browser & upcast
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
 
		//switching the control to activeElement & passing input in the box to sea
		driver.switchTo().activeElement().sendKeys("KGF Chapter 2", Keys.ENTER);
	}

}
