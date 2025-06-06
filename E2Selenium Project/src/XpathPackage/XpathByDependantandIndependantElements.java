package XpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependantandIndependantElements {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.com/");
			
			driver.findElement(By.id("date-Box")).click();
	
			driver.findElement(By.xpath("//div[text()='May']/..//span[text()='10']")).click();
	}
	

}
