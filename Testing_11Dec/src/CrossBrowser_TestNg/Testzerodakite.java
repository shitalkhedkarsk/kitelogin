package CrossBrowser_TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testzerodakite
{
	WebDriver driver;//cross browser testing-(chrome+firefox)
	Sheet mySheet ;//define sheet globally
	Zerodakite_pom1_login login ;//(a)
	ZerodaKite_pom2_pinPage pin;//(b)
	ZerodaKite_Pom3_home home;//(c)
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browser) throws EncryptedDocumentException, IOException, InterruptedException
	{
		if(browser.equals("chrome")) 
		{
			Reporter.log("opening chrome browser.....",true);
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--start-maximize");
//		opt.addArguments("--disable-notifications");
//		driver=new ChromeDriver(opt);
		driver=new ChromeDriver();
		
		}
		else if(browser.equals("firefox"))
		{
			Reporter.log("opening firefox browser",true);
			System.setProperty("webdriver.gecko.driver", "F:\\webdriver\\geckodriver\\geckodriver.exe");
			 driver=new FirefoxDriver();
			Thread.sleep(2000);
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		//excel sheet path
		FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");//define globally
		
		//1.create object of class to call method-
		//2.(a,b,c)declare it globally to give access through whole class
		  login = new Zerodakite_pom1_login (driver);
		  pin = new  ZerodaKite_pom2_pinPage(driver);
		  home = new ZerodaKite_Pom3_home(driver);
		
	}
	@BeforeMethod
	public void openLoginPage() 
	{
		//1.open login page
		login.enterUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("enter user Id....",true);
		login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("enter password....",true);
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//opening pin page
		Reporter.log("opening pin page.....",true);
		pin.enterPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("opening home page.....",true);
	}
  @Test
  public void validateTest()
  {
	  Reporter.log("taking expected value",true);
	  String expectedUserId = mySheet.getRow(0).getCell(0).getStringCellValue();
	  //actual
	  Reporter.log("taking actual value",true);
	  String actualUserId = home.validatelUserId();
	  SoftAssert as=new SoftAssert(); 
	 as.assertEquals(actualUserId, expectedUserId, "userId are not same");
	 as.assertAll();
	  Reporter.log("validating user Id ,TC is passed",true);
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("loging out from app....",true);
	  home.logOut();
	
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Reporter.log("closing browser.....",true);
	  Thread.sleep(1000);
	 driver.close();
	 
  }
}


