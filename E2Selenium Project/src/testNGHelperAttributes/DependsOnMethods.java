package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(dependsOnMethods = "addToCart")
	public void buyProduct()
	{
		Reporter.log("This is buyproduct Method", true);
	}
	@Test(dependsOnMethods = "register")
	public void login()
	{
		int i= 10;
		System.out.println(i/0);
		Reporter.log("This is login Method", true);
	}
	
	@Test
	public void register()
	{
		Reporter.log("This is register Method", true);
	}
	@Test(dependsOnMethods = {"register","login"})
	public void addToCart()
	{
		Reporter.log("This is addToCart Method", true);
	}
}
