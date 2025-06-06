package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver(); // To launch Browser
		
		driver.get("https://wwww.goindiago.in/");
		Thread.sleep(3000);

		driver.get("https://wwww.facebook.com/");
		Thread.sleep(3000);
		
		Navigation nav = driver.navigate();
		
		nav.to("https://dream11.com/");  // TO launch web application
		
		Thread.sleep(3000);
		
		nav.back();   // TO perform Backword Navigational operation
		Thread.sleep(3000);

		nav.forward();  // TO perform forword Navigational operation
		Thread.sleep(3000);
		
		nav.refresh();  // TO perform Backword Navigational operation

	}

	}


