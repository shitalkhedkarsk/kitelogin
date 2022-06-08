package assert_study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void f()
  {
	  String a="Pune";
	  Assert.assertNotNull(a, "a is not null");
	  System.out.println("a is not null");
	  Assert.assertNull(a, "a is not null ");
	  Assert.fail();
	  
  }
}
