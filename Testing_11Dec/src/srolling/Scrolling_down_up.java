package srolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_down_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*after opening page perform some actions 
		 1.create object of jsExecutor
		 */
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,200)");//scroll down
		//1
		//js.executeScript("window.scrollBy(0,700)");
		//2.
		//js.executeScript("window.scrollBy(0,2000)");
		//3.
		js.executeScript("window.scrollBy(0,7000)");
		//4.
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");//to scroll up
		
		
		
		
		
		
		
	}

}
