package testPackage;

import java.io.IOException;

import org.testng.Reporter;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pomPackage.CellPhonePage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
//@Listeners(testNGAnnotations2.MyListner.class)
public class AddToCartTest extends BaseTest {
	@Test
	public void addToCartTC_001() throws IOException, InterruptedException {
		WelcomePage wp = new WelcomePage(driver);

		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellphone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneaddtocartButton().click();

		wp.getShoppingcartLink1().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		if (sp.getSmartPhoneItem().isDisplayed()) {
			//System.out.println("Product is added to cart!!");
			Reporter.log("Product is added to cart!!", true);
		} else {
			//System.out.println("Product is not added to cart!!");
			Reporter.log("Product is not added to cart!!", true);

		}

	}

}
