package herokuapproject_TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import herokuapproject_Base_class.Base_class;

public class Challenging_DOM extends Base_class
{
	int i=0;
	@BeforeClass
	public void testSetup() throws IOException
	{
		launchBrowser("http://the-internet.herokuapp.com/challenging_dom");
		Reporter.log("launch browser successfully",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
  @Test
  public void handle_dom_data()
  {
	  List<WebElement> table = driver.findElements(By.xpath("//table//tbody//tr"));
	  Reporter.log("all table row search successfully ",true);
	 int table_size = table.size();
	 System.out.println("table size is "+table_size);
	 Reporter.log("row size counted successfully",true);
	 for(int row=0;row<table_size;row++)
	 {
		 String row_Data = table.get(row).getText();
		 System.out.println(row_Data);
		// Reporter.log("row data shown successfully",true);
	 }
  }
  
  
}
