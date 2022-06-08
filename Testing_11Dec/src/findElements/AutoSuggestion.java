package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutoSuggestion {

	
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("honda");
		Thread.sleep(1000);
		 List<WebElement> listOfSearch = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		System.out.println(listOfSearch.size());
		//syso display result only for one element so we are using for loop 
		//to display all element 
		Thread.sleep(1000);
		for( WebElement l:listOfSearch)
		{
			//System.out.println(l);
		
		/*	if(l.equals("honda amaze"))
			{
				l.click();
			}*/
			//using above command we cant click on reslut wehere
			//we want to click ie honda result so 
			String actualResult = l.getText();
			//System.out.println(l);
			String expectedresult = "honda amaze";
			//now compare it and click
			if(actualResult.equals(expectedresult))
			{
				l.click();
				break;
			}
			}
		
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='fWhgmd'])[9]")).click();
			
			
			
			
			
			
		}
		
	}

