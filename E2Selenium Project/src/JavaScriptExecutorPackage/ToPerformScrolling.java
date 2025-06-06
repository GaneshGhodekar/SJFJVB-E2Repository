package JavaScriptExecutorPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrolling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		// declaring implicite wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

		// launching web application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//to typecast webdriver ref into javascriptexecutor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//to perform vertical scrolling 400 horizontal & 1000 vertically
		jse.executeScript("window.scrollBy(400,1000)");
		Thread.sleep(1000);
		//to perform vertical scrolling 150 LHS horizontal & 300 vertically
		jse.executeScript("window.scrollBy(-150,300)");
		Thread.sleep(1000);
		//to perform vertical scrolling 0 horizontal & 650 upword vertically
		jse.executeScript("window.scrollBy(0,-650)");
		Thread.sleep(1000);
	}

}
