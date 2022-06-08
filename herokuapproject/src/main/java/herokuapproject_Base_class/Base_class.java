package herokuapproject_Base_class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// org.testng.Reporter;

public class Base_class
{
	protected static WebDriver driver;
	//protected String url=" http://the-internet.herokuapp.com/challenging_dom";
	public void launchBrowser(String url) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/broken_images");
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		
	}
	public void closeBrowser() 
	{

		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  driver.close();
	}
}
