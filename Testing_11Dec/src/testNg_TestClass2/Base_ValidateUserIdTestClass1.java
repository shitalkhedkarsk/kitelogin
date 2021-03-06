package testNg_TestClass2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_class3.Base_LaunchBrowser;
import testNg_POMclass1.Homepage_3;
import testNg_POMclass1.LoginPage1;
import testNg_POMclass1.PinPage_2;
import utility_class4.UtilityClass_ExcelSheet;


public class Base_ValidateUserIdTestClass1 extends Base_LaunchBrowser {
  
	int TCID=001;
	LoginPage1 login;
	PinPage_2 pin;
	Homepage_3 home;
	@BeforeClass
	public void launceApplicationKite() throws IOException 
	{
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new LoginPage1(driver);
		pin=new PinPage_2(driver);
		home=new Homepage_3(driver);
	}
	@BeforeMethod
	
		public void loginToKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
		{
			login.enterUserId(UtilityClass_ExcelSheet.getDataFromPropertiesFile("UN"));
			login.enterPassword(UtilityClass_ExcelSheet.getDataFromPropertiesFile("PWD"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
			
			login.clickOnLoginButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
			pin.enterPINno(UtilityClass_ExcelSheet.getDataFromPropertiesFile("PIN"));
			pin.clickSubmitButton();
		}
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException
	{
		//int TCID=001;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String actualUserId = home.getactualUserId();
		String expectedUserId = UtilityClass_ExcelSheet.getDataFromPropertiesFile("UN");
		
		//assert
		Assert.assertEquals(actualUserId, expectedUserId, "user id are not same");
		//screenshot
		//UtilityClass_ExcelSheet.takeScreenshot(driver, TCID);
		
  }
	@AfterMethod
	public void logoutFromKiteAppBrowser(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass_ExcelSheet.takeScreenshot(driver, TCID);
		} else
		{
			Reporter.log("TC is passed",true);
		}
	}
	@AfterClass
	public void browserClosing() throws InterruptedException
	{
		closeBrowser();
	}
}
