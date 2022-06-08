package selenim_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table_handling_29April {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html?m=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(WebElement r:radio)
		{
		String value = r.getAttribute("value");
		System.out.println("values from ratio button are ===>>>> "+value);
		
		

		if(value.equalsIgnoreCase("ruby"))
		{
			r.click();
		}
		}
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	for(WebElement c:checkbox)
	{
		String data = c.getAttribute("id");
		if(data.equalsIgnoreCase("code"))
		{
			c.click();
			break;

		}
	}
	
	
	System.out.println(checkbox.isEmpty());

		//driver.close();
	}
	

}
