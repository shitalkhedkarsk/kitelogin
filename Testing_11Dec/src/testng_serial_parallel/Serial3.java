package testng_serial_parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial3 {
	 @Test
	  public void method1() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
}
}
