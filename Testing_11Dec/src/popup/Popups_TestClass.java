package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;

public class Popups_TestClass 
{
	@BeforeClass
	public void openingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//opening two page 1.using get
		//2.nd using ACTIONS CLASS
		//cntrl + t
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
//	@BeforeMethod
//	public void openPage()
//	{
//		
//	}
	
}
