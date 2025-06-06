package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssertion {
	@Test
	public void verifyusingHardAssert() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		String expectedTitleofElectronicsPage = "Demo Web Shop. Electronics ";

		driver.findElement(By.partialLinkText("ELECTRONICS")).click();

//	  String actualTitleOfElectronicsPage = driver.getTitle();
//	  
//	  if(actualTitleOfElectronicsPage.equals(expectedTitleofElectronicsPage))
//	  {
//		  System.out.println("Electronics Page is displayed!!");
//	  }
//	  else
//	  {
//		  System.out.println("Electronics Page is Not Displayed");
//	  }

		Assert.assertEquals(driver.getTitle(), expectedTitleofElectronicsPage, "Electronics Page is not dispalyed");
		
		driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
		
		String expectedCellPhonesPageTitle = "Demo Web Shop. Cell phones";
		
		Assert.assertEquals(driver.getTitle(), expectedCellPhonesPageTitle, "CellPhones Page is Not Displayed");
	}
}
