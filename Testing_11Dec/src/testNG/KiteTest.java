package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiteTest {
  @Test
  public void method1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
  }
  @Test
  public void method2()
  {
	  System.out.println("hii good morning");
	  Reporter.log("hii,Good morning", true);
  }
}
