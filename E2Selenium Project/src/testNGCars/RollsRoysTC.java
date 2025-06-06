package testNGCars;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RollsRoysTC {
	  @Test(groups = "FT")
	  public void rollsroys()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.rolls-roycemotorcars.com/");
		  driver.quit();
  }
}
