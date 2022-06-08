package pom_test_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pom_Base_package.Browser_setUp;
import pom_Base_package.Screenshot;
import pom_Package.Home_page;
import pom_Package.Login_Page;

public class Login_test_case
{
	WebDriver driver;
	Login_Page ip;
	Home_page hp;
	int i=0;
	public void browserLaunch()
	{
		driver=Browser_setUp.startBrowser("chrome", "https://www.vtiger.com/home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
		ip=new Login_Page(driver);
		hp=new Home_page(driver);	
	}
	
	@Test
	public void login()
	{
		ip.user_login();
		ip.enter_password();
		ip.signin_app();
	}
	@AfterMethod
	public void screenshot(ITestResult result)
	{
		i=i+1;
		String name="Screenshot";
		String x=name+String.valueOf(i);
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.capture_screnshot(driver,x);
		}
		
	}
	@AfterTest
	public void closeBrowser()
	{
	driver.close();
	}
	
	
	
	
	
}
