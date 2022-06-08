package selenim_prac;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract_29 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("List of all links "+allLinks.size());
		
//		for(int i=0;i<=allLinks.size();i++)
//		{
//			WebElement url = allLinks.get(i);
//			String u = url.getAttribute("href");
//		}
		for(WebElement u:allLinks)
		{
			String url = u.getAttribute("href");
			verifyUrl(url);
		}
		
	}
	public static void verifyUrl(String singleUrl)
	{
		try {
			
			URL a=new URL(singleUrl);
			URLConnection b = a.openConnection();
			HttpURLConnection conn = (HttpURLConnection)b;
			conn.setConnectTimeout(5000);
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println(singleUrl+" url is not Valid "+conn.getResponseMessage());
			}


			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
