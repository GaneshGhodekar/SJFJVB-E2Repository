package handlingPopus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// declaring implicite wait
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// declaring explicit wait

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// launching web application
 		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		//to get address of parent/main window
	//	Set<String> parentwindowID = driver.getWindowHandles();
		
		
		//to Open new child window
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Thread.sleep(1000);
		
		//to get address of child window
		driver.findElement(By.linkText("Open a popup window")).click();
		
		// to get address of all window
		Set<String> allWindows = driver.getWindowHandles();
		
		
		
		//manually storing the title of expected window i.e child window
		String expectedTitle = "New Window";
		
		 for(String wi : allWindows)
		 {
			 driver.switchTo().window(wi);
			 String actualtitle = driver.getTitle();
			 
			 if(actualtitle.equals(expectedTitle))
			 {
				 break;
			 }
		 }
		
		 String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(text);
	}

}
