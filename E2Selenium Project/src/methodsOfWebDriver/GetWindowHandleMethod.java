package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();  // TO launch Browser
		
		driver.get("https://www.goindigo.in");  // To Launch Webapplication
	
		
		String parentWindowHandle = driver.getWindowHandle();  // To get address/session id/Handle of parent window
		
		System.out.println(parentWindowHandle);  // To print address/session id/Handle of parent window
	}

}
