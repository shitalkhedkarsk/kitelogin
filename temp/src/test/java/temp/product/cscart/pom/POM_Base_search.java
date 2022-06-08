package temp.product.cscart.pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import org.testng.Reporter;

public class POM_Base_search 
{
 

WebDriver driver;
 //Constructor
	public POM_Base_search(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath ="//input[@id='search_input']")
	 private WebElement txtbx_search;
	
	@FindBy(xpath = "//button[@title='Search']")
	private WebElement btn_search;
	
	//methods 
	public void setSearchTextBox(String arg)
	{
		txtbx_search.sendKeys(arg);
		Reporter.log("product entered in search box "+arg,true);
	}
	public void clickSearchButton()
	{
		btn_search.click();
		Reporter.log("search box button is clicked ",true);
	}
	//business method-user data its having always assertion 
	public void searchAppProduct(String arg)
	{
		
		setSearchTextBox(arg);
		clickSearchButton();
		//assertion enter something
		String actual=driver.getTitle();
		String expected="Search";
		Reporter.log("able to search product successfuly "+arg,true);
		Assert.assertEquals(actual,expected,"search product not displayed "+arg);
		
	}
	
}
