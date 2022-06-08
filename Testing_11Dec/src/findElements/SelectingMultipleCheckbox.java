package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingMultipleCheckbox {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement c:checkBox)
		{
			Thread.sleep(1000);
			c.click();
		}
		for(WebElement c:checkBox)
		{
			Thread.sleep(1000);
			c.click();
		}
		
		
		
		
	}

}
