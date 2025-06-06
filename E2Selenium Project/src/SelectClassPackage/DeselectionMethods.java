package SelectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement multiselectOD = driver.findElement(By.id("multiselect1"));
		
		//creating object of select class to handle multiselect dropdown
		
		Select sel = new Select(multiselectOD);
		
		//Selection Methods
		sel.selectByIndex(0);  //selecting an option by index..volvo
		Thread.sleep(1000);
		
		sel.selectByValue("audix");  //selecting an option by index..audi
		Thread.sleep(1000);

		sel.selectByVisibleText("Swift");  //selecting an option by index..Swift
		Thread.sleep(1000);
		
		//Deselection Method
		
		sel.deselectByValue("swiftx");
		Thread.sleep(1000);

		sel.deselectByIndex(3);
		Thread.sleep(1000);

		sel.deselectByVisibleText("Volvo");
		Thread.sleep(1000);

	}

}
