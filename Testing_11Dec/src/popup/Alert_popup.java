package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavalidation.com/demoalerts/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		WebElement alert = driver.findElement(By.xpath("//input[@value='Submit']"));
//		alert.click();
//		
//		Thread.sleep(500);
//		Alert click=driver.switchTo().alert();
//		System.out.println(click.getText());
//		click.accept();
//		//click.dismiss();
		
		Thread.sleep(500);
		WebElement senddata = driver.findElement(By.xpath("//input[@value='PromptMe']"));
		senddata.click();
		Thread.sleep(500);
		Alert click2=driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(click2.getText());
		click2.sendKeys("hiiiiiiiiiiii");
//		Thread.sleep(500);
//		click2.accept();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//programm 1
//		driver.get("https://demoqa.com/alerts ");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		//1.click on alert button
//		driver.findElement(By.xpath("//button[text()='Click me']")).click();
//		//switch selenium focus from main page to alert
//		Alert alertPopup = driver.switchTo().alert();
//		System.out.println("Text of alert popup is: "+alertPopup.getText());
//		alertPopup.accept();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		//h1.idden division popup
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		
	}

}
