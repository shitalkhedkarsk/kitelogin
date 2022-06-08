package assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void f() 
  {
	  //String a="abjhx";
	  String a=null;
	  Assert.assertNotNull(a, "String is having value ");
	  Reporter.log("result.......",true);
	  
	  
  }
}
