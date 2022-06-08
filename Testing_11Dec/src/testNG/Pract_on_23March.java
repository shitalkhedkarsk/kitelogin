package testNG;

//import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pract_on_23March {
	
  @Test( threadPoolSize = 3, invocationCount = 5)
  public void practice1()
  {
	  System.out.println("output is for practice1");
	  Reporter.log("tc is passed");
  }
  @Test
  public void practice2()
  {
	  System.out.println("output is for practice2");
	  Reporter.log("tc is passed");
  }
  @Test
  public void practice3()
  {
	  System.out.println("output is for practice3");
	  Reporter.log("tc is passed");
  }
}
