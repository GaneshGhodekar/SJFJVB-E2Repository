package JavaScriptExecutorPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ToScrollPerticularElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//to typecast webdriver ref into javascriptexecutor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//to find element till we need to scroll
		WebElement elementTobescroll = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		Thread.sleep(1000);
		
		//to scroll till desired webelement
		jse.executeScript("arguments[0].scrollIntoView(false)",elementTobescroll);

	}

}
