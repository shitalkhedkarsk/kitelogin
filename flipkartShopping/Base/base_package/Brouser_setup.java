package base_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
public class Brouser_setup
{
	 protected static  WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		Reporter.log("launch browser successfully....",true);
	}
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Closing Browser.....",true);
	}
	
	public void takescreenshotforTC(String TCname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\screenshot"+TCname+"amazonScrrenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC "+TCname,true);
	
	
	}
	
	

}
