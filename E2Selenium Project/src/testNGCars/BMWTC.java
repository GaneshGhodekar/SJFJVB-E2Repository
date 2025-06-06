package testNGCars;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMWTC {
	  @Test(groups = "FT")
	  public void bmw()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.bmw.in/en/index.html");
		  driver.quit();
  }
}
