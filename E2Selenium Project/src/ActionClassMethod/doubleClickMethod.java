package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// finding webelement & storing in a variable
				WebElement doubleClickTarget = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
				
				// creating object of action class

				Actions act = new Actions(driver);
				//to double click using  No argument methoad of 
				//act.moveToElement(doubleClickTarget).doubleClick().perform();
				
				// to double click using parameterized method of action class				
				act.doubleClick(doubleClickTarget).perform();
	}

}
