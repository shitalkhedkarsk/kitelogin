package popup;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Child_browser_2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1.
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allpageId = driver.getWindowHandles();
		System.out.println("Id of main page is "+allpageId);
		//2. "ITERATOR"
		Iterator<String> id=allpageId.iterator();
		String mainpageid = id.next();//pointing to 0th location
		String childpageid = id.next();//pointing to 1st location
		//3.switch focus of next page using
		Thread.sleep(500);
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("hello everyone");
		Thread.sleep(500);
		
		//4.switch focus to main page
		driver.switchTo().window(mainpageid);
		//perform action on main page 
		driver.findElement(By.xpath("//input[@name='home']")).click();
		
		
		//screenshot
		//File obj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to stored with unique name
		//RandomString name=new RandomString(2);
		//stored in desired location	
		//File img=new File("F:\\screenshot\\pic.png");
		//copy path
		//FileHandler.copy(obj, img);
		
		
		
	}

}
