package assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equal {
  @Test
  public void tc1() 
  {
	  String a="pune";
	  String b="pune1";
	  System.out.println("hiiiiii");
	  Assert.assertEquals(a,b,"String is not equal");
	  Reporter.log("result.......",true);
  }
}
