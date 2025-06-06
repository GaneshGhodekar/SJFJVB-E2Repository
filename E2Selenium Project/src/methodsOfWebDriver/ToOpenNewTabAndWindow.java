package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTabAndWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		
		//To Open a new tab & launch makemy trip
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		//To Open a new Window & launch zomato
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/");
		
	}

}
