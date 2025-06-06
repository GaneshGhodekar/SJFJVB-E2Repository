package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://omayo.blogspot.com/");
			
			
			//Finding the Disabled Element & storing it
			WebElement disableTB = driver.findElement(By.id("tb2"));
			Thread.sleep(2000); 
			
			//Typecasting WebDriver's Ref into JavaScriptExecutor
			  JavascriptExecutor jse = (JavascriptExecutor)driver;
			  
			  //To Pass input into disabled textBiox
//			  jse.executeAsyncScript("document.getElementById('tb2').value='Ganesh';");
			  
			  //TO Pass inputs into the disabled textBox
			  jse.executeAsyncScript("arguments[0].value='ganesh'", disableTB);
	}
	

}
