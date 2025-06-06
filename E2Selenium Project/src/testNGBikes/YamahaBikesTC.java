package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YamahaBikesTC {
	  @Test(groups = "IT")
	  public void yamaha()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.yamaha-motor-india.com/");
		  driver.quit();
  }
}
