package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;
	public void browserSetup() throws IOException
	{
		 Flib flib = new Flib();
		 String browservalue = flib.readPropertyData(PROP_PATH, "chrome");
		 String url = flib.readPropertyData("./testData/TestData.properties", "url");
		 
		 if (browservalue.equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
		 }

		 else if (browservalue.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 
		 else if (browservalue.equalsIgnoreCase("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Invalid browser");
		 }
		 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		 
		 }
	}
	


