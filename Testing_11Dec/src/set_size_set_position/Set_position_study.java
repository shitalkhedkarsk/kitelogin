package set_size_set_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Set_position_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\webdriver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Point origanalvalue = driver.manage().window().getPosition();
		System.out.println("original position of window is "+origanalvalue);
		//change position
		Point p=new Point(5, 5);
		driver.manage().window().setPosition(p);
		System.out.println("new position of window is "+p);
	}

}
