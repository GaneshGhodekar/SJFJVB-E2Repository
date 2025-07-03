package testPackage;

import java.io.IOException;

import org.testng.Assert;
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
		try {
		logger.info("*****Starting AddToCartTest*****");
		WelcomePage wp = new WelcomePage(driver);

		wp.getElectronicsLink().click();
		logger.info("*****Welcome to Electronics Page*****");
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellphone().click();

		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneaddtocartButton().click();
		logger.info("*****Welcome to CellPhone Page*****");

		wp.getShoppingcartLink1().click();
		logger.info("*****Welcome to ShoppingCart Page*****");
		logger.info("*****Validating Purchase added*****");

		ShoppingCartPage sp = new ShoppingCartPage(driver);
//		if (sp.getSmartPhoneItem().isDisplayed()) {
//			// System.out.println("Product is added to cart!!");
//			Reporter.log("Product is added to cart!!", true);
//		} else {
//			// System.out.println("Product is not added to cart!!");
//			Reporter.log("Product is not added to cart!!", true);
//	}
		Assert.assertTrue(sp.getSmartPhoneItem().isDisplayed(), "Smartphone was not added to the cart!");
		Reporter.log("XXXXXXXXXXXXXXXXXXXXXProduct is added to cart!!XXXXXXXXXXXXXXXXXXXX", true);
		
        } catch (Exception e) {
            logger.error("Test failed due to an exception: ", e);
            Reporter.log("Test failed: " + e.getMessage(), true);
            Assert.fail("Test failed due to exception: " + e.getMessage());

	}
	}
}
