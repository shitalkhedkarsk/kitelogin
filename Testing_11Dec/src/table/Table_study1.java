package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_study1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//table
	 List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='product']//th"));
		//table.click();
		//System.out.println(table.getText());
		//it will display single table header like instructor 
		//to display all header we are using for each loop
	for(WebElement h:tableheader)
	{
		System.out.print(h.getText()+" ||");
		//if you not use getText method it will show you only 
		//xpath not the text
	}
	List<WebElement> allTableRowData = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		for(WebElement r:allTableRowData)
		{
			System.out.print(r.getText()+" ||");
			
		}
		System.out.println( );
		
		
		
		
		
		
		
		
		
		
		

	}

}
