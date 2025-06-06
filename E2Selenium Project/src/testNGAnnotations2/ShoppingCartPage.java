package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//Declaration
	@FindBy(xpath = "//input[@name='removefromcart']/../..//img[@alt='Picture of Smartphone']") private WebElement smartPhoneItem;
	@FindBy(xpath = "//a[text()='Smartphone' and @class='product-name']/../..//input[@name='removefromcart']") private WebElement smartphonecheckbox;
	@FindBy(name = "updatecart") private WebElement updatesoppingcartbutton;
	@FindBy(id="termsofservice")private WebElement termsofservicebutton;
	@FindBy(id="checkout") private WebElement checkoutbutton;
	
	
	//Initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//Utilization
	public WebElement getSmartPhoneItem() {
		return smartPhoneItem;
	}
	public WebElement getSmartphonecheckbox() {
		return smartphonecheckbox;
	}
	public WebElement getUpdatesoppingcartbutton() {
		return updatesoppingcartbutton;
	}
	public WebElement getTermsofservicebutton() {
		return termsofservicebutton;
	}
	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	
	
	
}
