package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfiedBikeTC {
	  @Test(groups = "FT")
	  public void royal()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.royalenfield.com/in/en/home/");
		  driver.quit();
  }
}
