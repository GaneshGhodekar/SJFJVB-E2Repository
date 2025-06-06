package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOHandleDisabledButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		//Finding the Disabled Element & storing it
		WebElement hiddenTB = driver.findElement(By.id("custom_gender")); 
		
		//typecasting the ref of webdriver interface into javascriptExecutor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//passing inputs in the hidden webElement
		jse.executeScript("arguments[0].value='Is it Working??'", hiddenTB);
		

	}

}
