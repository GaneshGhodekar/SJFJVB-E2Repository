package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HondaBikeTC {
	  @Test(groups = "RT")
	  public void honda()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.honda2wheelersindia.com/");
		  driver.quit();
  }
}
