package test_suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "regression")
	  public void a() 
	  {
		  Reporter.log("method a testing....",true);
	  }
	  @Test(groups = "regression")
	  public void a11() 
	  {
		  Reporter.log("method a11 sting....",true);
	  }
	  @Test(groups = "sanity")
	  public void a10() 
	  {
		  Reporter.log("method a10 atesting....",true);
	  }
	  @Test(groups = "sanity",priority = -5)
	  public void d() 
	  {
		  Reporter.log("method d  testing....",true);
	  }@Test(groups = "sanity")
	  public void e() 
	  {
		  Reporter.log("method e testing....",true);
	  }
	  @Test(groups = "sanity")
	  public void f() 
	  {
		  Reporter.log("method f  testing....",true);
	  }@Test(groups = "regression")
	  public void x() 
	  {
		  Reporter.log("method x testing....",true);
	  }
	  @Test(groups = {"regression","sanity"})
	  public void y() 
	  {
		  Reporter.log("method y  testing....",true);
	  }
}
