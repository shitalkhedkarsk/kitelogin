package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_nested {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		Thread.sleep(500);
		WebElement parentframe = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(parentframe.getText());
		Thread.sleep(500);
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		Thread.sleep(500);
		driver.switchTo().frame(childframe);
		WebElement childframe1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(childframe1.getText());
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		WebElement elem = driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
		elem.click();
		System.out.println(elem.getText());
		
		
	}

}
