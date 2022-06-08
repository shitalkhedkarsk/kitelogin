package testng_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class loginTest_priority {
  @Test(priority = -6)
  public void userName()
  {
	  Reporter.log("entering username",true);
  }
  @Test(priority = -5, dependsOnMethods = "userName")
  public void password()
  {
	  Reporter.log("entering password",true);
  }
  @Test
  public void clickbutton()
  {
	  Reporter.log("clicking on login button",true);
  }
}
