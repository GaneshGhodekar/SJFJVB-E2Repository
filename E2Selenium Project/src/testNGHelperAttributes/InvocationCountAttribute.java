package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountAttribute {
  @Test(invocationCount = 0)  //This testcase will not be involked
  public void Login() {
	  Reporter.log("This is Login Method", false);
  }
  @Test(invocationCount = 1)  //This testcase will be involked 1 time
  public void register(){
	  Reporter.log("This is Register Method", true);
  }
    @Test(invocationCount = 2) //This testcase will be involked 2 time
  public void addToCart() {
	  Reporter.log("This is Login Method", true);
  }
  }
