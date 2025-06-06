package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1\r\n");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(500);

		WebElement button1 = driver.findElement(By.id("btn30"));
		
		WebElement button2 = driver.findElement(By.id("btn31"));
		
		WebElement button3 = driver.findElement(By.id("btn32"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(button1).contextClick().perform();               //performing right click on button1
		driver.findElement(By.xpath("//div[text()='Yes']")).click();		//selecting yes option
		Thread.sleep(500);

		//capturing message after selecting yes option
		WebElement message1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(message1.getText());      // printing captured messgae
		Thread.sleep(500);
		
		act.contextClick(button2).perform(); //performing right click on button2
		driver.findElement(By.xpath("//div[text()='No']")).click(); //selecting no option
		Thread.sleep(500);
		//capturing message after selecting no option
		WebElement message2 = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println(message2.getText());      // printing captured messgae
		Thread.sleep(500);

		act.contextClick(button3).perform(); //performing right click on button3
		driver.findElement(By.xpath("//div[text()='5']")).click(); //selecting no option
		Thread.sleep(500);
		//capturing message after selecting no option
		WebElement message3 = driver.findElement(By.xpath("//span[text()='You selected \"5\"']"));
		System.out.println(message3.getText());      // printing captured messgae
		Thread.sleep(500);
		
		
		

		
	}

}
