package test_package;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_package.Brouser_setup;
import pom_package.HomePage;
import pom_package.PinPage;
import utility_package.Utility;

public class NewTest  extends Brouser_setup
{
	
	
	HomePage home;
	PinPage pinno;
	@BeforeClass
	public void browserLaunch()
	{
		launchBrowser();
		
		home=new HomePage(driver);
		pinno=new PinPage(driver);
		
	}
	@BeforeMethod
	public void clickOnLoginWithKite() throws EncryptedDocumentException, IOException
	{
		
		home.enterId(Utility.readDataFromExcelSheet(0, 0));
		home.enterPassword(Utility.readDataFromExcelSheet(0, 1));
		home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		pinno.enterPin(Utility.readDataFromExcelSheet(0, 2));
		pinno.clickOnContinueButton();
		
	}
	
	
	
	
  @Test
  public void f() 
  {
  }
  @AfterClass
  public void closingBrowser()
  {
	  closeBrowser();
  }
}
