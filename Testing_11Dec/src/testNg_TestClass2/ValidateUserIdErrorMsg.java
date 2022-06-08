package testNg_TestClass2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_class3.Base_LaunchBrowser;
import testNg_POMclass1.Homepage_3;
import testNg_POMclass1.LoginPage1;
import testNg_POMclass1.PinPage_2;
import utility_class4.UtilityClass_ExcelSheet;

public class ValidateUserIdErrorMsg extends Base_LaunchBrowser
{
	LoginPage1 login;
	PinPage_2 pin;
    Homepage_3 home;
	@BeforeClass
	public void openBrowser ()
	{
		launchBrowser();
		Reporter.log("opening browser.....",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//create object
		login=new LoginPage1(driver);
		pin=new PinPage_2(driver);
		home=new Homepage_3(driver);
	}
	@BeforeMethod
	public void loginToKiteHomePage() throws EncryptedDocumentException, IOException
	{
		//we are checking error message for UserId
		//login.enterUserId(UtilityClass_ExcelSheet.pathForExcelSheet(0, 0));
		login.enterPassword(UtilityClass_ExcelSheet.pathForExcelSheet(0, 1));
		login.clickOnLoginButton();
		
	}
	
  @Test
  public void validateuserIdErrorMsgOnHomePage() throws EncryptedDocumentException, IOException
  {
	  int TCID=201;
		String getActualErrorMsg1Real = login.getActualErrorMsg1();
		String expectedErrorMsg = UtilityClass_ExcelSheet.pathForExcelSheet(0, 3);
		Assert.assertEquals(getActualErrorMsg1Real, expectedErrorMsg, "error msg is not matching");
		Reporter.log("error msg matches.....,TC passed",true);
		UtilityClass_ExcelSheet.takeScreenshot(driver, TCID);
		Reporter.log("Taking screenshot....",true);
  }
  @AfterClass
  public void closingBrowser()
  {
	  closeBrowser();
  }
}
