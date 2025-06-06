package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingSizeofwindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();  // to launch browser & upcast
		driver.manage().window().maximize();   // to maximize browser window
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize(); // to get dimensions of browser window
		
		int height = size.getHeight ();  // to get height of browser
		int width = size.getWidth ();  // to get height of browser
		
		System.out.println("height is:"+height+"  Width is :"+width);  // to print height & width
		Thread.sleep(2000);
		Dimension targetSize = new Dimension(500, 300); // Object of DImension class to specify width and height
		driver.manage().window().setSize(targetSize);

	}

}
