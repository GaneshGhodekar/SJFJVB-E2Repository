package testNGCars;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BentlyTC {
	  @Test(groups = "RT")
	  public void bently()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.bentleymotors.com/en.html");
		  driver.quit();
  }
}
