package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//prgm for Iframe
		
		driver.switchTo().frame("iframeResult");//1.this will switch to iframe
		Thread.sleep(500);
		//2.then perform action on frame like click or sendkeys 
		WebElement action = driver.findElement(By.xpath("//button[@type='button']"));
		action.click();
		Thread.sleep(500);
		//want to go on main page 
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		//click on change theme button
		WebElement changetheme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		changetheme.click();
	}

}
