package soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class notNull_null {
  @Test
  public void f() 
  {
	  SoftAssert s=new SoftAssert();
	 // String a="ska";
	  String a=null;
	  //s.assertNotNull(a,"a is null");
	  s.assertNull(a, "a is not null");
	  s.assertAll();
	  Reporter.log("checking a value");
  }
}
