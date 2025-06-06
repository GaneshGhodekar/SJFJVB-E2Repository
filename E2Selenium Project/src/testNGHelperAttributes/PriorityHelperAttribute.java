package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityHelperAttribute {

	@Test(priority = -5)
	public void login()
	{
		Reporter.log("This is login Method", true);
	}
	
	@Test(priority = -10)
	public void register()
	{
		Reporter.log("This is register Method", true);
	}
	@Test(priority = 2)
	public void addToCart()
	{
		Reporter.log("This is addToCart Method", true);
	}
}
