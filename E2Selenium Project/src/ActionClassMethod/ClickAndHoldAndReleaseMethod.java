package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1\r\n");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(500);

		//finding element to click & hold & then release
		WebElement clickandHoldElement = driver.findElement(By.xpath("//div[@id='circle']"));
		
		//crating object of action class
		Actions act = new Actions(driver);
		
		//to click & hold the element for 3 sec using parameterized method
		act.moveToElement(clickandHoldElement).clickAndHold().perform();
		Thread.sleep(3000);
		
		//to release element  which is held using nonparameterized method
		act.release(clickandHoldElement).perform();
		
		

	}

}
