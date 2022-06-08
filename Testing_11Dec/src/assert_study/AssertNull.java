package assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void tc() 
  {
	  //String a=null;
	  String a="Pune";
	  Assert.assertNull(a,"a is not empty");
	  Reporter.log("result.......",true);
	  
  }
}
