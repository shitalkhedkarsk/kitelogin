package selenim_prac;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Brokrn_link_prgm {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String obj = link.getAttribute("href");
			System.out.println(obj);
		
		HttpURLConnection obj2=(HttpURLConnection)(new URL(obj).openConnection());
		
		obj2.connect();
		if(obj2.getResponseCode()>=400)
		{
			System.out.println("link is broken");
		}else {
			System.out.println("link is not broken");
		}
		}
	}

}
