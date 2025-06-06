package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class RemovefromCartTC extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
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
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartphonecheckbox().click();
		
		sp.getUpdatesoppingcartbutton().click();
	}

}
