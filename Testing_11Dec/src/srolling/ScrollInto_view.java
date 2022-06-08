package srolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInto_view {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//scrollInto view method require webelement to perform action
		//find locator for webelement
		WebElement ref = driver.findElement(By.id("checkBoxOption1"));
		
		//2.typecast
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//3.
		js.executeScript("arguments[0].scrollIntoView();",ref);
		Thread.sleep(500);
		ref.click();
		
		
		
	}

}
