package assert_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
	@Test
	  public void tc1() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement userId = driver.findElement(By.id("userid"));
			boolean result = userId.isDisplayed();
			boolean result1=false;
		  Assert.assertFalse(result1, "element is not find");
		  
	  }
 }
