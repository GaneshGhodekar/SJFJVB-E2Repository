package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pomPackage.CellPhonePage;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericPackage.MyListner.class)
public class BuyIItemFromCartTest extends BaseTest{
@Test
	public void buyitemTC002() throws IOException, InterruptedException {
		
		//BaseTest bt = new BaseTest();
		//bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellphone().click();
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneaddtocartButton().click();
		
		wp.getShoppingcartLink1().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartphonecheckbox().click();
		
		scp.getTermsofservicebutton().click();
		scp.getCheckoutbutton().click();
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
