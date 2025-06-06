package SelectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page ");
		Thread.sleep(1000);
		
			WebElement dayOD = driver.findElement(By.id("day"));
			WebElement monthOD = driver.findElement(By.id("month"));
			WebElement yearOD = driver.findElement(By.id("year"));
			Thread.sleep(1000);
			
			//Select class object to handle day dropdown
			Select day = new Select(dayOD);
			day.selectByIndex(24); // selecting option based on index-->25
			Thread.sleep(1000);
			
			//Select class object to handle month dropdown
			Select month = new Select(monthOD);
			month.selectByValue("6"); // selecting option based on value-->June
			Thread.sleep(1000);
			
			//Select class object to handle year dropdown
			Select year = new Select(yearOD);
			year.selectByVisibleText("1996"); // selecting option based on visible text-->1996
			Thread.sleep(1000);
			
			
	}

}
