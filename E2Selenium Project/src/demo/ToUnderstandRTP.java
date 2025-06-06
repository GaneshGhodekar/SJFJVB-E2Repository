package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUnderstandRTP { // RunTime Polymorphysm.

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Browser Name");
			String browserValue = sc.next();

if (browserValue.equalsIgnoreCase("Chrome"))
					{
			driver=new ChromeDriver();
}
else if(browserValue.equalsIgnoreCase("firefox"))
{
			driver=new FirefoxDriver();
}
else if(browserValue.equalsIgnoreCase("edge"))
{
			driver=new EdgeDriver();
}
else 
{
			System.out.println("Enter valid browser Name");
}
		}
		Thread.sleep(3000);
	driver.close();
	}

}
