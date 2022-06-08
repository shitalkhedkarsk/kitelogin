package soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_fail {
  @Test
  public void f() 
  { //program is not ok
	  SoftAssert s=new SoftAssert();
	 
		//s.fail();
		  String a=null; 
		  String c="pune";
			 String b="pune";
			 
		 s.assertEquals(c, b, "c and b are not equal");
		  s.assertNull(a, "a is not null");
		  s.fail();
		  s.assertAll();
		  Reporter.log("checking a value",true);
  }
}
