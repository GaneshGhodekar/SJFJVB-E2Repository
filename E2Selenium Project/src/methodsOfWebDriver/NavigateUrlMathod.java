package methodsOfWebDriver;

import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrlMathod {

	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver = new ChromeDriver();   //  To Launch the browser
		driver.get("https://www.goindigo.in/");  // to launch goindiago web application
		Thread.sleep(3000);
		
		Navigation nav = driver.navigate();
		
		// URL url = new URL("https://www.dream11.com/"); Create the object of URL class and pass URL of application
		// nav.to(url); pass ref of URL class as an SArgument
		
		nav.to(("https://www.dream11.com/"));  // create object of url class inside to () & pass url
		Thread.sleep(3000);

		nav.back(); // to perform backword navigational operation
		Thread.sleep(3000);

		nav.forward(); // to perform forword 
		Thread.sleep(3000);

		nav.refresh(); // to perform refresh
	}

}
