package SelectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		// to find multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		//creating object of select class to handle the dropdown
		Select sel = new Select(dropdown);
		//to check whether dropdown is multiselect or single select
		boolean result = sel.isMultiple();
		
		if(result==true)
		{
			System.out.println("Dropdown is multiselect");
		}
		else
		{
			System.out.println("Dropdown is  Single select");
		}
			List<WebElement> dropdownOps= sel.getOptions();
			
			int i=0; // initializing value of i to select multiple from dropdown
					for(@SuppressWarnings("unused") WebElement we :dropdownOps)
					{
						sel.selectByIndex(i);
						Thread.sleep(500);
						i++; // incramenting value of I by 1
					}
					// TO deselect all
					sel.deselectAll();
					}
	}
	


