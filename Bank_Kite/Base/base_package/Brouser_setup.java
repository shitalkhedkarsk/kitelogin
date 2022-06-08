package base_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Brouser_setup
{
	 protected static  WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		Reporter.log("launch browser successfully....",true);
	}
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Closing Browser.....",true);
	}
	
	

}
