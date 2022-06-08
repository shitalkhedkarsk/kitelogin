package CrossBrowser_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class CT_2 {
 @Parameters("browserName")
	@Test
  public void f(String browserName) 
  {
	 WebDriver driver=null;
	 
	 if(browserName.equals("chrome"))
	 {
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
	 	driver=new ChromeDriver();
		
		Reporter.log("opening chrome browser",true);
  }
 	else if (browserName.equals("firefox"))
 	{
			System.setProperty("webdriver.gecko.driver", "F:\\webdriver\\geckodriver\\geckodriver.exe");
			 driver=new FirefoxDriver();
			Reporter.log("opening firefox browser",true);
	  }
	  driver.get("https://www.google.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.close();
}
//	@Test
//	  public void f3() 
//	  {
//			System.setProperty("webdriver.msedge.driver", "F:\\webdriver\\edge driver\\msedgedriver.exe");
//			WebDriver driver=new MicroSoftEdgeDriver();
//			driver.get("https://www.google.com/");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	  }
}
