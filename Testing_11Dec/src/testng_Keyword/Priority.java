package testng_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test
	  public void x() 
	  {
		  Reporter.log("method x testing....",true);
	  }
	  @Test( dependsOnMethods = "d")
	  public void b() 
	  {
		  Reporter.log("method b  testing....",true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("method c testing....",true);
	  }
	  
	  public void f() 
	  {
		  Reporter.log("method f testing....",true);
	  }
	  @Test
	  public void g() 
	  {
		  Reporter.log("method g testing....",true);
	  }
	  @Test
	  public void h() 
	  {
		  Reporter.log("method h testing....",true);
	  }
}
