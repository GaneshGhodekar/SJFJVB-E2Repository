package SelectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		// to find multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		//creating object of select class to handle the dropdown
		Select sel = new Select(dropdown);
		

		sel.selectByVisibleText("Audi");
		Thread.sleep(500);
		sel.selectByIndex(2);
		Thread.sleep(500);
		
		sel.selectByValue("Swiftx");
		Thread.sleep(500);
		
		//To fetch all selected options
		List<WebElement> allSelectedOps = sel.getAllSelectedOptions();
		//get text of each options
		for(WebElement we:allSelectedOps)
		{
			
			String text = we.getText();
			System.out.println(text);
			Thread.sleep(500);
		}
	}

}
