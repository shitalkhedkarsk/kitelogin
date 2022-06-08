package soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_equal {
	 SoftAssert s=new SoftAssert();
  @Test
  public void tc1() 
  {
	 String a="pune";
	 String b="pune";
	 //String b="pune23";
	 s.assertEquals(a, b, "a and b are not equal");
	 s.assertAll();
	  Reporter.log("checking a and b values",true);
  }
}
