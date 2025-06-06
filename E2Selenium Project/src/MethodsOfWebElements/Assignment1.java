package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		 WebElement emailTB = driver.findElement(By.id("Email"));
		 WebElement passwordTB = driver.findElement(By.id("Password"));
		 
		 Rectangle emailrect = emailTB.getRect();
			int emailwidth = emailrect.getWidth();
			int emailheight = emailrect.getHeight();
			int emailxaxis = emailrect.getX();
			int emailyaxis = emailrect.getY();
		 
		 Rectangle passrect = passwordTB.getRect();
			int passwidth = passrect.getWidth();
			int passheight = passrect.getHeight();
			int passxaxis = passrect.getX();
			int passyaxis = passrect.getY();
			
			System.out.println(" Email Width is :"+emailwidth+" Height is :"+emailheight+" X-Axis is :"+emailxaxis+" Y-Axis is :"+emailyaxis);
			System.out.println(" Pass Width is :"+passwidth+" Height is :"+passheight+" X-Axis is :"+passxaxis+" Y-Axis is :"+passyaxis);
			
			if(emailxaxis==passxaxis) {
				System.out.println("X-axis Left Alignment is Correct");
			}
			else {
				System.out.println("X-axis Left Alignment is Not Correct");
			}
			
			if((emailxaxis+emailwidth)==(passxaxis+passwidth)) {
				System.out.println("X-axis Right Alignment is Correct");
			}
			else {
				System.out.println("X-axis Right Alignment is Not Correct");
			}
			int overlap =(passyaxis) -(emailyaxis+emailheight);
			if(overlap>0) {
				System.out.println("Email is Not Overlapping Password");
			}
			else {
				System.out.println("Email is Overlapping Password");
			}
			
			
			
	}
}
