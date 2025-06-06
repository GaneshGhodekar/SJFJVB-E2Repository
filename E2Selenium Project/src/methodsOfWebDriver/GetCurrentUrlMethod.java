package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  // To Launch Browser
		
		driver.get("https://www.zomato.com/");  // To Launch Web application
		
		String currentUrl = driver.getCurrentUrl();  // To fetch current Url
		
		System.out.println(currentUrl);  // To print the current Url

	}

}
