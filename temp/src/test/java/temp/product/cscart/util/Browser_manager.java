package temp.product.cscart.util;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;




public class Browser_manager
{
 

public static  WebDriver getDriver(String type,String url)
 {	
	WebDriver driver=null; 
	 if(type.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
	 }
	 else if(type.equalsIgnoreCase("firefox"))
	 {
		// driver = new FirefoxDriver();
	 }
	 else if(type.equalsIgnoreCase("safari"))
	 {
		 // driver = new SafariDriver();
	 }
	 else {
		 Assert.assertTrue(false, "no browser selected");
	 }
	 
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.manage().window().maximize();
	  driver.get(url);
	  Reporter.log("navigate to browser : "+type+"URL: "+url,true);
	  return driver();
	  
 }

private static WebDriver driver() {
	// TODO Auto-generated method stub
	return null;
}


}
