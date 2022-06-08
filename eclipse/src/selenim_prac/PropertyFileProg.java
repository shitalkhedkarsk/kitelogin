package selenim_prac;


import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileProg {
	 static WebDriver driver;
	public static void main(String[] args) throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
//		Properties prop=new Properties();
//		FileInputStream file=new FileInputStream(System.getProperty(null));

	}

}
