package waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WAITS_IMPLICIT_EXPLICIT {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement userid = driver.findElement(By.id("userid"));
		userid.sendKeys("DAA677");
		//explicit wait
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(userid));
		
		driver.findElement(By.id("password")).sendKeys("Velocity@123");
		//fluent wait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(500))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		
		WebElement button=wait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//button[@type='submit']"));
		
		}
		});
		button.click();
		
		
	}

}
