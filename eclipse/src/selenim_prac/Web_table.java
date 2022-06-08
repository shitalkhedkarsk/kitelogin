package selenim_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		//select table
//		driver.findElement(By.id("customers")).click();
//		//traverse through table
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
//		int total_rows = rows.size();
//		System.out.println("total no of rows are "+total_rows);
//		for(int i=0;i<total_rows;i++)
//		{
//			List<WebElement> row_Data = rows.get(i).findElements(By.xpath("//table[@id='customers']//tbody//tr"));
//			//int cell_count = row_Data.size();
//			String data = row_Data.get(i).getText();
//			System.out.println("data inside row no "+i+" is "+data);
////			for(int j=0;j<cell_count;j++)
////			{
////				String cell_Text = row_Data.get(j).getText();
////				System.out.println("data inside row no "+i+" and cell no "+j+" is "+cell_Text);
////				
////			}
//		}
		
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.id("customers")).click();
		//table
		driver.findElement(By.xpath("//table[@border='1']")).click();
		//row
		List<WebElement> total_rows = driver.findElements(By.xpath("//table[@border='1']//tbody//tr"));
	    int row_count = total_rows.size();
		System.out.println("total no of rows in table are "+row_count);
		for(int row=0;row<row_count;row++)
		{
			String data = total_rows.get(row).getText();
			System.out.println("data inside row no "+row+" is "+data);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
