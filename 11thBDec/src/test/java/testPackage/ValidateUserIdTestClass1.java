package testPackage;
import java.io.IOException;
//import java.io.IOException;
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
import pomPackage.*;
import utility_class4.UtilityClass_ExcelSheet;
//import utility_class4.*;
public class ValidateUserIdTestClass1 extends Base_LaunchBrowser {
  
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
			login.enterUserId(UtilityClass_ExcelSheet.pathForExcelSheet(0,0));
			login.enterPassword(UtilityClass_ExcelSheet.pathForExcelSheet(0,1));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
			
			login.clickOnLoginButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
			pin.enterPINno(UtilityClass_ExcelSheet.pathForExcelSheet(0,2));
			pin.clickSubmitButton();
		}
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException
	{
		//int TCID=001;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String actualUserId = home.getactualUserId();
		String expectedUserId = UtilityClass_ExcelSheet.pathForExcelSheet(0, 0);
		
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
