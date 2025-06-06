package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPositionOfWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();  // to launch browser & upcast

		//to get position
		Point point = driver.manage().window().getPosition();
		
		int xaxis = point.getX(); //to get value of x axis
		int yaxis = point.getY();  // to get value of y axis
		
		//to print value of x & y axis
		System.out.println("X axis is :"+xaxis+ "Y-Axis is:"+yaxis );
		Thread.sleep(2000);
		
		// Creating Object of point & passing x & Y value in pixels
		Point targetPoint = new Point (250, 180);
		
		//to set position of browser window
		driver.manage().window().setPosition(targetPoint);
	}

}
