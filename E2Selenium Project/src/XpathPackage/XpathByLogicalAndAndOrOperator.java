package XpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByLogicalAndAndOrOperator {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///F:/Selenium%20Work%20in%20class/Web%20Elements/Gender.html");
			
			driver.findElement(By.xpath("//input[@name='gender'and@id='Female']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='gender'or@id='Female']")).click();
		
	}

}
