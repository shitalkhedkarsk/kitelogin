package test_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("browserName")
  @Test
  public void setUp(String browserName) 
  {
	  WebDriver driver=null;
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
	  }
	  else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\webdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	  else if(browserName.equals("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "F:\\webdriver\\edge driver.exe");
		  driver=new EdgeDriver();
	  }
	  driver.get("https://support.zerodha.com/category/your-zerodha-account/login-credentials");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	  
	  
	  
	  
  }
}
