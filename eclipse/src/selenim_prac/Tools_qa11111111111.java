package selenim_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools_qa11111111111 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//div[@class='card-up'])[1]")).click();

	}

}
