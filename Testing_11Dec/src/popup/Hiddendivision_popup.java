package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

//import net.bytebuddy.utility.RandomString;

public class Hiddendivision_popup {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//practice example3
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		
		
		
		
		
		
		
		//driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
		//2close popup
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//1.select cart option 
		//driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
//		//3.screenshot
//		File img=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//to add random string this will avoid 
//		//overrwriting of file
//		String name=RandomString.make(2);
//		File ddest=new File("F:\\screenshot\\nameimg "+ name +".png");
//		FileHandler.copy(img, ddest);
		
		
		
		
		
		
		
		
		
	}

}
