package soft_Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrue_false {
  @Test
  public void f() 
  {
	  SoftAssert s=new SoftAssert();
	  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement userId = driver.findElement(By.id("userid"));
		boolean c = userId.isDisplayed();
		s.assertTrue(c, "user id is not displayed");
		s.assertAll();
		Reporter.log("checking value of userid.....");
  }
}
