package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {
 
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver(); //To launch browser
		
		driver.get("https://www.zomato.com/");  // TO launch webapplication
		
		String title = driver.getTitle();   // To Fetch the title of web page
		
		System.out.println(title);  // To print title
	}
	
}
