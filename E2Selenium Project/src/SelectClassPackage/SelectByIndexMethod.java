package SelectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///F:/Selenium%20Work%20in%20class/Web%20Elements/dropdown.html");
				
				//To find the dropdown & store
				WebElement compniesID = driver.findElement(By.name("companies"));
				Thread.sleep(1000);
				
				Select Sel=new Select(compniesID);
				
				Sel.selectByIndex(2);
				}

}
