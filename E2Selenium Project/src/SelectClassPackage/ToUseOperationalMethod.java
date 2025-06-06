package SelectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseOperationalMethod {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium%20Work%20in%20class/Web%20Elements/dropdown.html");
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.name("companies"));
		 Select sel = new Select(dropdown);
		 
		 //To select options from multiselect dropdown
		 
		 sel.selectByIndex(4);
		 Thread.sleep(500);
		 
		 sel.selectByVisibleText("Neilsoft");
		 Thread.sleep(500);
		 
		 sel.selectByValue("wipro");
		 Thread.sleep(500);

		 boolean result = sel.isMultiple();
		 if(result==true)
		 {
			 System.out.println("Dropdown is multiselect");
		 }
		 else
		 {
			 System.out.println("dropdown is singleselect");
		 }
		WebElement firstselOps = sel.getFirstSelectedOption();
		String firstOptText = firstselOps.getText();
		System.out.println("First Selected Options is" +firstOptText);
		
		System.out.println("------All Selected Options Are-----");
		List<WebElement> allSelOps = sel.getAllSelectedOptions();
		for (WebElement we:allSelOps)
		{
			System.out.println(we.getText());
		}
		// logic to fetch Options which are not selected
		List<WebElement> allOps = sel.getOptions();
		allOps.removeAll(allSelOps);
		
		
		System.out.println("------Non Selected Options are------");
		for(WebElement we : allOps)
		{
			System.out.println(we.getText());
		}
					
	}

}
