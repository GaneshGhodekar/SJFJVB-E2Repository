package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		//To create the object & upcast into WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//TO Launch web application
		driver.get("https://www.zomato.com/");

	}

}
