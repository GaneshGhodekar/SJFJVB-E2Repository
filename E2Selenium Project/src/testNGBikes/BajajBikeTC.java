package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BajajBikeTC {

	  @Test(groups = "FT")
	  public void bajaj()
	  { 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.bajajauto.com/bikes");
		  driver.quit();

		

	}

}
