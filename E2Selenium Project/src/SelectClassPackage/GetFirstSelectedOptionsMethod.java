package SelectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		// to find multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		//creating object of select class to handle the dropdown
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(2);
		Thread.sleep(500);
		
		sel.selectByValue("Swiftx");
		Thread.sleep(500);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		WebElement firstSelectOpt = sel.getFirstSelectedOption();
		String text = firstSelectOpt.getText();
		System.out.println(text);
	}

}
