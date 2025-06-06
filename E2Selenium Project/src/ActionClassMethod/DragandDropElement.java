package ActionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		//finding the source element
		WebElement oslocapitalsrc = driver.findElement(By.id("box1"));
		//getting background color of src element before dragging
		String beforedropping = oslocapitalsrc.getCssValue("background-color");
		System.out.println(beforedropping);
		
		//finding target element
		WebElement norwayoslotarget =  driver.findElement(By.id("box101"));
		
		//creating object of actions class
		Actions act = new Actions(driver);
		
		//to drag source element & drop into target element
		act.dragAndDrop(oslocapitalsrc, norwayoslotarget).perform();
		
		Thread.sleep(500);
		//getting the background-color of src element after dragging
		String afterdropping = oslocapitalsrc.getCssValue("background-color");
		System.out.println(afterdropping);
		
					}

}
