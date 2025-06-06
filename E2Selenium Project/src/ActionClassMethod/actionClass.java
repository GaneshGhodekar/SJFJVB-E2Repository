package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.kalkifashion.com/");

		// driver.findElement(By.id("deny")).click();

		WebElement targetElement = driver.findElement(By.id("HeaderMenu-saree"));

		Actions act = new Actions(driver);
		act.moveToElement(targetElement).perform();

	}

}
