package testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study {
  @Test
  public void sampletest() 
  {
	Reporter.log("Sample test page",true);  
  }
  @BeforeMethod
  public void loginPage()
  {
	  Reporter.log("loging into page",true);
  }
  @BeforeClass
  public void openurl()
  {
	  Reporter.log("opening url",true);
  }
}
