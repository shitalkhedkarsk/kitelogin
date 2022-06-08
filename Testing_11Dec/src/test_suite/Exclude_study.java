package test_suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exclude_study {
	@Test
	  public void x() 
	  {
		  Reporter.log("method x testing....",true);
	  }
	  @Test
	  public void y() 
	  {
		  Reporter.log("method y  testing....",true);
	  }
}
