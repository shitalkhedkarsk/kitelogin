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
import testNg_POMclass1.LoginPage1;
import utility_class4.UtilityClass_ExcelSheet;

public class ValidatePasswordErrorMsg extends Base_LaunchBrowser
{
	LoginPage1 login;
	
@BeforeClass
public void OpenBrowser()
{
	launchBrowser();
	//create object to call methods 
	login=new LoginPage1(driver);
	Reporter.log("opening browser.....",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//create object
	login=new LoginPage1(driver);
}
@BeforeMethod
public void loginIntoBrowser() throws EncryptedDocumentException, IOException
{
	login.enterUserId(UtilityClass_ExcelSheet.pathForExcelSheet(0, 0));
	login.clickOnLoginButton();
}	
  @Test
  public void validateerrorMsgForPwd() throws IOException
  {
	  int TCID=301;
	  String ActualErrormsgForPwd = login.getErrorMsgforPwd();
	  String expectedErrormsgForPwd = UtilityClass_ExcelSheet.pathForExcelSheet(0, 4);
	  Assert.assertEquals(ActualErrormsgForPwd ,expectedErrormsgForPwd, "error msg is not matching");
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
