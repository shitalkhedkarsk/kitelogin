package selenim_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table_asx2_2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.manage().window().maximize();
			//find element on which want to take action 
		driver.findElement(By.xpath("(//div[@id='pnProductNavContents']//li[@role='tab'])[2]")).click();
		List<WebElement> table_data = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[2]//tr"));
		int size_of_table = table_data.size();
		System.out.println("table total rows are "+size_of_table);
		for(int row=0;row<size_of_table;row++)
		{
			String table_row_data = table_data.get(row).getText();
			System.out.println(table_row_data);
			//column wise data
			List<WebElement> cell_Data = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[2]//tr//td"));
			int cell_Size = cell_Data.size();
			for(int cell=0;cell<cell_Size;cell++)
			{
				String data = cell_Data.get(cell).getText();
				System.out.println(data);
			}
		}
	
	
	}

}
