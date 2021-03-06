package base_class3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility_class4.UtilityClass_ExcelSheet;

public class Base_LaunchBrowser
{
	protected WebDriver driver;
public void launchBrowser() throws IOException
{
	Reporter.log("opening chrome browser.....",true);
	System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(UtilityClass_ExcelSheet.getDataFromPropertiesFile("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.manage().window().maximize();
	Reporter.log("Browserlaunched sussess",true);
}

public void closeBrowser() 
{

	  Reporter.log("closing browser.....",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.close();
}
}
