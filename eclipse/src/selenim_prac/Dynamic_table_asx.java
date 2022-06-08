package selenim_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table_asx {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www2.asx.com.au/");
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	driver.manage().window().maximize();
		//find element on which want to take action 
	driver.findElement(By.xpath("(//div[@id='pnProductNavContents']//li[@role='tab'])[2]")).click();
	List<WebElement> table_iteam = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[1]//tr"));
//	for(WebElement items:Table_iteam)
//	{
//		System.out.println(items.getText());
//	}
	int sizeOfTable = table_iteam.size();
	System.out.println(sizeOfTable);
	for(int row=0;row<sizeOfTable;row++)
	{
		String row_data = table_iteam.get(row).getText();
		
		System.out.println(row_data);
		//for column data
		List<WebElement> cell_data = driver.findElements(By.xpath("(//table[@class='md-bootstrap-tooltip'])[1]//tr//td"));
		int cell_items_table = cell_data.size();
		System.out.println(cell_items_table);
		for(int cell=0;cell<cell_items_table;cell++)
		{
			String data_cell = cell_data.get(cell).getText();
			System.out.println(data_cell);
		}
	}
	
	
	
	}

}
