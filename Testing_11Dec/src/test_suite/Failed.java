package test_suite;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed {
	@Test
	  public void tc6() throws InterruptedException 
	  {
			
		  Reporter.log("method tc6 testing....",true);
	  }
	  @Test
	  public void tc7() 
	  {
		  Reporter.log("method btc7 testing....",true);
	  }
	  @Test
	  public void tc8() 
	  {
		 Assert.fail();
		  Reporter.log("method tc8 testing....",true);
	  }
	 
}
