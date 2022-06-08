package selenim_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Naukari_dropdown_handle {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.get("https://www.naukri.com/");
//		driver.get("https://demoqa.com/menu#");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
////		WebElement serv = driver.findElement(By.xpath("//div[text()='Services']"));
////		act.moveToElement(serv).perform();
//		System.out.println(serv.getText();
		
//		Actions act=new Actions (driver);
//		WebElement item = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
//		act.moveToElement(item).build().perform();
//		WebElement sub_item = driver.findElement(By.xpath("(//a[@href='#'])[5]"));
//		act.moveToElement(sub_item).build().perform();
//		WebElement sub_sub_item = driver.findElement(By.xpath("(//a[@href='#'])[7]"));
//		act.moveToElement(sub_sub_item).click().build().perform();
		
//		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.get("https://www.naukri.com/");
//		driver.get("https://demoqa.com/slider");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(slider, 25, 0).click().build().perform();
//		
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.naukri.com/");
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement new_window = driver.findElement(By.id("messageWindowButton"));
		new_window.click();
		System.out.println(new_window.getText());
		
	}

}
