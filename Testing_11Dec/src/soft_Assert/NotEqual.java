package soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NotEqual {
  @Test
  public void f()
  {
	  SoftAssert s=new SoftAssert();
	  String a="hii";
	  //String b="hii";
	  String b="hii123";
	  s.assertNotEquals(a, b, "a and b are equals");
	  s.assertAll();
	  Reporter.log("checking a and b values....");
  }
}
