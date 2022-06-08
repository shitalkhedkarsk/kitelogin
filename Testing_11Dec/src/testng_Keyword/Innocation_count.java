package testng_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innocation_count {
	@Test(timeOut = 100)
	  public void a() 
	  {
		  Reporter.log("method a testing....",true);
	  }
	  @Test(invocationCount = 5,enabled = false)
	  public void b() 
	  {
		  Reporter.log("method b  testing....",true);
	  }
	  @Test(enabled = false)
	  public void c() 
	  {
		  Reporter.log("method c testing....",true);
	  }
}
