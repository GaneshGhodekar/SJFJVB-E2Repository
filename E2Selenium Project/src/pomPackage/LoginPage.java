package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//Declaration
	
	@FindBy(id = "Email")private WebElement emaillink;
	@FindBy(name = "Password")private WebElement passwordlink;
	@FindBy(id = "RememberMe")private WebElement remembermechkbox;
	@FindBy(linkText = "Forgot password")private WebElement forgotpasswordLink;
	@FindBy(xpath = "//input[@value='Log in']")private WebElement loginbuttonlink;
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements (driver, this);
	}
//Utilization
	
	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getRemembermechkbox() {
		return remembermechkbox;
	}

	public WebElement getForgotpasswordLink() {
		return forgotpasswordLink;
	}

	public WebElement getPasswordlink() {
		return passwordlink;
	}

	public WebElement getLoginbuttonlink() {
		return loginbuttonlink;
	}

	//Operational  Method/Buissness Logic
	
	public void validloginMethod(String email, String password) throws InterruptedException
	{
	emaillink.sendKeys(email);
	Thread.sleep(500);
	passwordlink.sendKeys(password);
	loginbuttonlink.click();
	}
	public void invalidloginMethod(String email, String password) throws InterruptedException
	{
	emaillink.sendKeys(email);
	Thread.sleep(500);
	passwordlink.sendKeys(password);
	Thread.sleep(500);
	loginbuttonlink.click();
	
	Thread.sleep(500);
	emaillink.clear();
	Thread.sleep(500);

	passwordlink.clear();
	Thread.sleep(500);


	}
}
