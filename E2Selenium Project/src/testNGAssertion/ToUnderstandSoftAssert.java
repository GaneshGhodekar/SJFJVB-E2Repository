package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void toUnderstandSoftAssert() {
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		String expectedTitleofElectronicsPage = "Demo Web Shop. Electronics ";

		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedTitleofElectronicsPage, "Electronics Page is not Displayed");
		
		driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
		
		String expecedTitleOfCellPhonePage = "Demo Web Shop. Cell phones  ";
		
		sa.assertEquals(driver.getTitle(),expecedTitleOfCellPhonePage, "Cell Phone Page is not displayed");
		sa.assertAll();
  }
}
