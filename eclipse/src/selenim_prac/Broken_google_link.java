package selenim_prac;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_google_link {

	public static void main(String[] args ) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links present on webpage "+allLinks.size());
		for(WebElement links:allLinks)
		{
			String singleLink = links.getAttribute("href");
			//System.out.println(singleLink);
			validatethelink(singleLink);
		}
	}
	public static void validatethelink(String availableLinks)
	{
		try {
			URL obj=new URL(availableLinks);
			URLConnection a = obj.openConnection();
			HttpURLConnection b = (HttpURLConnection)a;
			b.connect();
			if(b.getResponseCode()>=400)
			{
				System.out.println(availableLinks+"  "+b.getResponseMessage()+" RESPONSE code is "+b.getResponseCode());
			}
			else
			{
				System.out.println(availableLinks+" "+b.getResponseMessage()+" RESPONSE code is "+b.getResponseCode());
			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	

}
