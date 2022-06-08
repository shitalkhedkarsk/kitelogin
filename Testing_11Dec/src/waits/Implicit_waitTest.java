package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Implicit_waitTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
	 
//	  ChromeOptions opt=new ChromeOptions();
//	  opt.addArguments("start-maximized");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  Reporter.log("open url successfully");
	  driver.manage().window().maximize();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
}
