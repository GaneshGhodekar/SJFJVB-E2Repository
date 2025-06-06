package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
	
	//Declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smartPhoneaddtocartButton;
	
	//Initialization
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getSmartPhoneaddtocartButton() {
		return smartPhoneaddtocartButton;
	}

	
	

}
