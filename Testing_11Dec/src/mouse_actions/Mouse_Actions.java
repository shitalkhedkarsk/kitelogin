package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.find locator of element
		WebElement option = driver.findElement(By.id("checkBoxOption1"));
		//2.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", option);
		Thread.sleep(500);
		//3. create Actions class
		Actions act=new Actions(driver);
		//4.use Actions class method and use perform() method at end
		//4.a
		//act.click(option).perform();
		//4.b
		act.moveToElement(option).click().build().perform();
		
		
		
		
		
		
		
	}

}
