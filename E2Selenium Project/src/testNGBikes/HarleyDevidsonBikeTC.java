package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HarleyDevidsonBikeTC {
	  @Test(groups = "IT")
	  public void Harley()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.harley-davidson.com/in/en/index.html");
		  driver.quit();
  }
}
