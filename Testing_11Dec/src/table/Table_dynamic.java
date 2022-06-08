package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_dynamic {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//all table headder
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
			int cellCount = header.size();
			System.out.println("Total cell count "+cellCount);
//		for(WebElement head:header)
//		{
//			System.out.print(head.getText()+" ||");
//			
//		}
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='product']//tr"));
		int rowCount = rowData.size();
		System.out.println("total row count "+rowCount);
//		for(WebElement r:rowData)
//		{
//			System.out.print(r.getText());
//		}
		
		//for loop for row
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=cellCount;j++)
			{
				if(i==1)//to print 1st row
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]//th[" +j+ "]")).getText();
					System.out.print(text+" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]//td[" +j+ "]")).getText();
					System.out.print(text+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
