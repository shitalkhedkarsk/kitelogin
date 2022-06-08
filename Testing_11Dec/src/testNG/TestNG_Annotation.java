package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Annotation {
  @Test
  public void method1() 
  {
	  Reporter.log("method 1 testing....",true);
  }
  @Test
  public void method2() 
  {
	  Reporter.log("method  testing....",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("method 1 testing....",true);
  }
  
  
  
  
  
  
}
