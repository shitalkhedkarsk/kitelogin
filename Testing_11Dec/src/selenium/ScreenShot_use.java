package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

//Screenshot 
public class ScreenShot_use {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//screenshot
		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(pic);
		RandomString location=new RandomString(2);
		File destination=new File("F:\\screenshot\\pic"+location+".png");
		//System.out.println(destination);
		FileHandler.copy(pic, destination);
	}

}
