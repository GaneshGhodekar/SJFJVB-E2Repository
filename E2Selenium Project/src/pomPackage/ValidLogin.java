package pomPackage;

import java.io.IOException;

//import methodsOfWebDriver.LoginPage;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);

		LoginPage lp = new LoginPage(driver);
//		lp.getEmaillink().sendKeys(email);
//		lp.getPasswordlink().sendKeys(pwd);
//		lp.getLoginbuttonlink().click();
		lp.validloginMethod(email, pwd);
	}

}
