package popup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//open particular browser
		//using Actions class
//		Thread.sleep(1000);
//		WebElement url = driver.findElement(By.cssSelector("body"));
//		url.sendKeys(Keys.CONTROL + "t");
//		driver.get("https://www.gmail.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
		//autosuggestion in google
		WebElement list = driver.findElement(By.xpath("//input[@name='q']"));
		list.sendKeys("selenium tutorial");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 List<WebElement> result = driver.findElements(By.xpath("(//div//ul[@role='listbox'])[1]"));
		for(WebElement loop:result)
		{
		System.out.println(loop.getText());
//		if(loop.equals("selenium tutorial w3schools"))
//		{
//			loop.click();
//		}
		}
		
	}

}
