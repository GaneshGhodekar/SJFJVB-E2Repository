package pomPackage;

import java.io.IOException;

public class BuyItemsFromCart extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);

		LoginPage lp = new LoginPage(driver);
		lp.validloginMethod(email, pwd);
		
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
		
		String city = flib.readExcelData(EXCEL_PATH, BPD, 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH, BPD, 1, 1);
		String pincode = flib.readnumericData(EXCEL_PATH, BPD, 1, 2);
		String phone = flib.readnumericData(EXCEL_PATH, BPD, 1, 3);
		
		WorkLib wl = new WorkLib();
		int rn = wl.randomNumber();
		
		String phoneNo = phone + rn;
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.buyProductMethod(city, address1, pincode, phoneNo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
