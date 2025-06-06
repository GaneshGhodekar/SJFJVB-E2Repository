package XpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium%20Work%20in%20class/Web%20Elements/Textbox.html");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ljhgdsljgbfds");
	}

}
