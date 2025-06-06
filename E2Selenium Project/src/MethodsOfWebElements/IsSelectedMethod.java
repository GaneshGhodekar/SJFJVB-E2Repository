package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(2000);
		
		WebElement rememberMeCheckBox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		
		if(rememberMeCheckBox.isSelected()) {
			System.out.println("Remember Me Check Box Is Already Selected ");
		}
		else {
			rememberMeCheckBox.click();
			System.out.println("Remember Me Check Box Is Selected");
		}
		
		
	}
}
