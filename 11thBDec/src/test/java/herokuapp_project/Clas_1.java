package herokuapp_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clas_1 {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		WebElement button = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
//		button.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		button.click();
//		button.click();
//		driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
		
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//Broken images
		List<WebElement> images = driver.findElements(By.id("img"));
		System.out.println(images);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
