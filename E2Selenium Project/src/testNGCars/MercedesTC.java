package testNGCars;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MercedesTC {
	  @Test(groups = "RT")
	  public void mercedes()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.mercedes-benz.co.in/");
		  driver.quit();
  }
}
