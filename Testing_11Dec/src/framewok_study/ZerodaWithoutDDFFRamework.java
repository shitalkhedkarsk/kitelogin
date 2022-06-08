package framewok_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodaWithoutDDFFRamework {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.Login Page
		WebElement userName = driver.findElement(By.xpath("//input[@id='userid']"));
		userName.sendKeys("DAA677");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Velocity@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(1000);
		//2.PIN page
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("866918");
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		Thread.sleep(1000);
		//....
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserId = userId.getText();
		String expectedUserId = "DAA677";
		//4.username==userId
				if(actualUserId.equals(expectedUserId))
				{
					System.out.println("both name is same");
				}
				else
				{
					System.out.println("test case is fail");
				}
		
		//3.main page
		
		
		//5.logout
		//driver.findElement(By.xpath("//a[@target='_self']")).click();
		//Thread.sleep(1000);
		//6.close tab
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
