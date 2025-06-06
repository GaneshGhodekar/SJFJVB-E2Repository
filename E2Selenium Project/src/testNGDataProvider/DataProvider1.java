package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name="invalidcreds")
	public String [][] dataProviderMethod()
	{
		String [][] arr={{"ganeshghodekar@gmail.com",	"Ganesh@456"},
						 {"ganeshghoekar@gmail.com",	"Ganesh@4"},
						 {"ganeshghodeka@gmail.com",	"Ganesh@5"},
						 {"gaeshghodekar@gmail.com",	"Ganesh@1"},
						 {"ganeshghodear@gmail.com",	"Gansh@456"}
					};
		return arr;
	}
  @Test(dataProvider = "invalidcreds", dataProviderClass = testNGDataProvider.DataProvider1.class)
  public void invalidlogin(String email, String Password) throws InterruptedException 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("");
	  Thread.sleep(500);
	  driver.findElement(By.id("Password")).sendKeys("");
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  
	  
	  driver.quit();
//	  driver.findElement(By.id("Email")).clear();
//	  driver.findElement(By.id("Password")).clear();


  }
}
