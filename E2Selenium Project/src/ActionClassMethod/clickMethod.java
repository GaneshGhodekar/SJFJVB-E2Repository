package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// finding webelement & storing in a variable
		WebElement uploadFileButton = driver.findElement(By.id("uploadfile"));

		// trying to click on webelement by using click() of WebElement Interface
		// uploadFileButton.click(); --->Webelclick() doesn't work

		// creating object of action class
		Actions act = new Actions(driver);

		// To perform click Operation using click() of action class
		// act.moveToElement(uploadFileButton).click().perform();

		// to perform click operation using click(WebElement target) of Actions class
		act.click(uploadFileButton).perform();
	}

}
