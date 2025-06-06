package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CheckoutPage {

		// Declaration
		
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement countryIdDD;
	@FindBy(id = "billing-address-select") private WebElement billingaddressOldAddress;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement addressTB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNoTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInformationContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContinueButton;
	@FindBy(xpath = "//input[@onclick='setLocation('/')']") private WebElement lastContinueButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']") private WebElement orderConfirmMessage;
	
	
	
	//Initilization
	public CheckoutPage(WebDriver driver) {
PageFactory.initElements(driver, this);
	}
	//Initialization


	public WebElement getCountryIdDD() {
		return countryIdDD;
	}


	public WebElement getBillingaddressOldAddress() {
		return billingaddressOldAddress;
	}


	public WebElement getCityTB() {
		return cityTB;
	}


	public WebElement getAddressTB() {
		return addressTB;
	}


	public WebElement getPincodeTB() {
		return pincodeTB;
	}


	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}


	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}


	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}


	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}


	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}


	public WebElement getPaymentInformationContinueButton() {
		return paymentInformationContinueButton;
	}


	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}


	public WebElement getLastContinueButton() {
		return lastContinueButton;
	}


	public WebElement getOrderConfirmMessage() {
		return orderConfirmMessage;
	}
	
//Operational method/Business Logic

	public void buyProductMethod(String city, String address1, String pincode, String phoneNo) throws InterruptedException
	{
		WorkLib wl = new WorkLib();
		
		if(billingaddressOldAddress.isDisplayed())
		{
			wl.selectByvisibleText(billingaddressOldAddress,"New Address");
		}
		else
		{
			wl.selectByvisibleText(countryIdDD, "India");
		}
		wl.selectByvisibleText(countryIdDD,"India");
		cityTB.sendKeys(city);
		addressTB.sendKeys(address1);
		pincodeTB.sendKeys(pincode);
		phoneNoTB.sendKeys(phoneNo);
		
		
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInformationContinueButton.click();
		confirmOrderContinueButton.click();
		Thread.sleep(500);
		
		if(orderConfirmMessage.isDisplayed())
		{
			System.out.println("Order is placed Successfulley!!!");
			Reporter.log("Order is placed Successfulley!!!");
		}
		else
		{
			System.out.println("Order is Not Placed Successfulley!!!");
			Reporter.log("Order is not placed Successfulley!!!");

		}
	}
	
		

	}


