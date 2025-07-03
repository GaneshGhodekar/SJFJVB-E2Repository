package testPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pomPackage.CellPhonePage;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
import utilities.Flib;
import utilities.WorkLib;
@Listeners(utilities.MyListner.class)
public class BuyIItemFromCartTest extends BaseTest{
@Test
	public void buyitemTC002() throws IOException, InterruptedException {
	logger.info("*****Starting BuyIItemFromCartTest*****");
	try {
		//BaseTest bt = new BaseTest();
		//bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();
		Assert.assertTrue(driver.getTitle().contains("Electronics"), "Navigation to Electronics page failed");
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellphone().click();
		Assert.assertTrue(driver.getTitle().contains("Cell phones"), "Navigation to Cell Phones page failed");
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneaddtocartButton().click();

		
		wp.getShoppingcartLink1().click();
		Assert.assertTrue(driver.getTitle().contains("Shopping Cart"), "Navigation to Shopping Cart failed");
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartphonecheckbox().click();
		
		scp.getTermsofservicebutton().click();
		scp.getCheckoutbutton().click();
//		Assert.assertTrue(driver.getTitle().contains("Checkout"), "Checkout page not reached");

		Flib flib = new Flib();
		String city = flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 0);
		String address1 = flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 1);
		String pincode = flib.readnumericData(TEST_EXCEL_PATH, BPD, 1, 2);
		String phone = flib.readnumericData(TEST_EXCEL_PATH, BPD, 1, 3);
		
		WorkLib wl = new WorkLib();
		int rn = wl.randomNumber();
		
		String phoneNo = phone + rn;
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.buyProductMethod(city, address1, pincode, phoneNo);
		// Final assertion after successful purchase
        Assert.assertTrue(cop.getOrderConfirmMessage().isDisplayed(), "Order was not successfully placed");
	
    } catch (Exception e) {
        logger.error("Test case buyitemTC002 failed due to: " + e.getMessage(), e);
        Assert.fail("Exception encountered in buyitemTC002: " + e.getMessage());
    }
	}

}
