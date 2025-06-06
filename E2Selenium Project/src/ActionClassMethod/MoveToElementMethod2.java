package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// finding target element & storing in variable.
		WebElement fashionElement = driver.findElement(By.xpath("//span[text()='Fashion']"));

		// creating object of action class
		Actions act = new Actions(driver);

		// performing mouse hover action on target web element
		act.moveToElement(fashionElement).perform();

	}

}
