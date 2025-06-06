package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTomethod {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.zomato.com/");
			Thread.sleep(2000);
			
			//finding target element to scroll
			WebElement targetElement = driver.findElement(By.linkText("District"));
			Thread.sleep(2000);
			//creagting the object of Actions class
			Actions act =new Actions(driver);
			
			//Performing scrolling operation till Webelement
			act.scrollToElement(targetElement).perform();
			
	}

}
