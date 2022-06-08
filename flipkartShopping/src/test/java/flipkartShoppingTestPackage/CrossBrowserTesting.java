package flipkartShoppingTestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(flipkartShoppingListnerpackage.LisnerClassFlipkart.class)
public class CrossBrowserTesting {
	
	@Parameters("browser")
  @Test
  public void crossbrowser( String browser) 
  {
		WebDriver driver = null;
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Opening chrome browser successfully......",true);

	}
	if(browser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.msedge.driver", "F:\\webdriver\\edge driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		Reporter.log("Opening edge browser successfully......",true);

	}
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "F:\\webdriver\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));	
  }
}
