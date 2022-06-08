package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		WebElement logInButtton = driver.findElement(By.xpath("//a[text()='Log in']"));
		logInButtton.click();
		
		
	}

}
