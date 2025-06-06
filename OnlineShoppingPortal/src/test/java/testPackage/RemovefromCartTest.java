package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pomPackage.CellPhonePage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericPackage.MyListner.class)

public class RemovefromCartTest extends BaseTest {
@Test
	public void removefromcart003() throws EncryptedDocumentException, IOException, InterruptedException {
		//BaseTest bt = new BaseTest();
	//	bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
	//	wp.getLoginLink().click();

		//Flib flib = new Flib();
	//	String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		//String pwd = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);

	//	LoginPage lp = new LoginPage(driver);
		//lp.validloginMethod(email, pwd);
		
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
