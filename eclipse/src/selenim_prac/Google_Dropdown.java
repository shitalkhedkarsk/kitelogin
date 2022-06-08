package selenim_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Dropdown {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//1
		Actions act=new Actions(driver);
		WebElement searchTab = driver.findElement(By.xpath("//input[@name='q']"));
		//2.waits
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(searchTab));
		//
		act.click(searchTab).sendKeys("ind").build().perform();
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class='aajZCb']//ul//li"));
		for(WebElement op: searchResult)
		{
			System.out.println("All result "+op.getText());
			String autoSuggestionResult = op.getText();
			String expectedRsult = "Indian Railways";
			if(autoSuggestionResult.equals(expectedRsult))
			{
				op.click();
				break;
			}
		
		
		}
		
		
		
		
		
		
		
		
	}

}
