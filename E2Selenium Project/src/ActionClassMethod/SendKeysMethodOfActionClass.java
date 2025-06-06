package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethodOfActionClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		WebElement passwordTB = driver.findElement(By.id("Password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		//creating object of action class
		Actions act = new Actions(driver);
		
		//sending i/p to email textfield using sendkeys() of Action class
		//act.moveToElement(emailTB).sendKeys("ganesh@gmail.com").perform();
		
		act.sendKeys(emailTB, "ganesh@gmail.com").perform();
		Thread.sleep(2000);

		//sending i/p to password textfield using sendkeys() of Action class
		//act.moveToElement(passwordTB).click().sendKeys("12334").perform();

		act.sendKeys(passwordTB, "1234").perform();
		Thread.sleep(2000);
		
		//performing click operation on login button
		act.click(loginButton).perform();

		
		
		
		
		
		
		



		
		
		
		
		
		
	}

}
