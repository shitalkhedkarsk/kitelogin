package set_size_set_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//first check the size of main window
		Dimension defaultPosition = driver.manage().window().getSize();
		System.out.println("Default size of window is "+defaultPosition );
		//1.change size
		//a. use dimension class
		Dimension s=new Dimension(700,300);
		//b.set dimension
		driver.manage().window().setSize(s);
		System.out.println("new window size is "+s);
	}

}
