package flipkartShoppingTestPackage;


import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_package.Brouser_setup;
import pom_package.Amazon1Pom;
@Listeners(flipkartShoppingListnerpackage.LisnerClassFlipkart.class)
public class BrowserTesting2 extends Brouser_setup
{
	Amazon1Pom p1;
	@BeforeTest
	public void launchB()
	{
		launchBrowser();
		 p1=new Amazon1Pom(driver);
	}
	@BeforeMethod
	public void user()
	{
		p1.popuphandling();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		p1.clickOnUser();
	}
  @Test
  public void r( ) 
  {
	  
  }
}
