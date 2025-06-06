package genericPackage;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;




public class MyListner extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "Started]", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "Successfulley Executed]", true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		 Reporter.log("[Testcase--"+result.getName()+"has failed]", true);
		 
		 String DT = LocalDateTime.now().toString();
		 String dateTime = DT.replaceAll(":","-");
		 
		 			 TakesScreenshot ts = (TakesScreenshot)driver;
                     File src = ts.getScreenshotAs(OutputType.FILE);
                     File dest = new File("./screenshots/" +result.getName()+""+dateTime+".png");
                     
                    	 try {
							Files.copy(src, dest);
						} catch (java.io.IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                     
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "is skipped]", true);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "has failed with certain percentage]", true);

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "has failed with timeout]", true);

	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("[Testcase--" + context.getName() + "is started]", true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("[Testcase--" + context.getName() + "is Finished]", true);

	}

}
