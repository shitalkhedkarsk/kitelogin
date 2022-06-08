package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Child_browser3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//scrolling
				//1.a
				JavascriptExecutor	js=(JavascriptExecutor)driver; 
				//1.b
				js.executeScript("window.scrollBy(0,500)");
		
		
		//2.
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		Thread.sleep(1000);
		//1.
				Set<String> id = driver.getWindowHandles();
				Iterator<String> obj=id.iterator();
				String mainpageId = obj.next();//0th index
				String childpage = obj.next();//1st index
		//3
		driver.switchTo().window(childpage);
		driver.manage().window().maximize();
		Thread.sleep(500);
		/*a.we can't perform step no4 
		n we are getting exception -"ElementClickInterceptedException"
	 	because before clicking on that element there is advertisement on page
		b...to solve this problem we are using 'scrolling' */
		//scrolling
		//1.a
		JavascriptExecutor	js2=(JavascriptExecutor)driver; 
		//1.b
		js2.executeScript("window.scrollBy(0,500)");
		
		//4.perform action on child window
		WebElement selector = driver.findElement(By.xpath("//select[@class='select_categories']"));
		selector.click();//click on dropdown
		Thread.sleep(500);
		Select s=new Select(selector);//create select  class
		s.selectByVisibleText("Responsive");
		Thread.sleep(500);
		
		
		//5.switch focus to main page*/
		driver.switchTo().window(mainpageId);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[text()='Go back to the Tutorial']")).click();
		
		//takescreenshot
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
