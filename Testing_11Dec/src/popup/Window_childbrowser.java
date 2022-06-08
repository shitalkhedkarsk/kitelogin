package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://skpatro.github.io/demo/links/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//find window Id
//		String mainwindoId = driver.getWindowHandle();
//		System.out.println("main window id is "+mainwindoId);
//		
//		//opening child browser
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
//		Set<String> allwindows = driver.getWindowHandles();
//		System.out.println("all windows ids are "+allwindows);
		
		
		
		
		//program 2 with another url
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String obj = driver.getWindowHandle();
		System.out.println("id of page is "+obj);
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		
		
		
	}

}
