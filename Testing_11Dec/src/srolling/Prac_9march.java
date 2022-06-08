package srolling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_9march {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//scrolling
		//1.type cast driver object
		//2.alert popup
		Thread.sleep(1000);
		driver.navigate().refresh();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
	}

	
}
