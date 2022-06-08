package assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqual_study {
  @Test
  public void tc1() 
  {
	  String a="Pune";
	  String b="Pune23";
	  Assert.assertNotEquals(a, b, "String value is equal");
	  Reporter.log("result........", true);
	  
  }
}
