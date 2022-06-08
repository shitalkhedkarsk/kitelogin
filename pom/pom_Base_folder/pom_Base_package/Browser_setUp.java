package pom_Base_package;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_setUp 
{
	static WebDriver  driver;
	public static WebDriver startBrowser(String browserName,String url) 
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		return driver;
	}
}
