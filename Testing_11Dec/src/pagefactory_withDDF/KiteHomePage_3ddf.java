package pagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage_3ddf 
{
	//variable
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserIDno;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
	//2.constructor
	public  KiteHomePage_3ddf (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.method
	public void checkUserId()
	{
		
		String actualUserId = UserIDno.getText();
		String expectedUserId = "DAA677";
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("tc is passed");
		}
		else
		{
			System.out.println("tc is failed");
		}
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		UserIDno.click();
		Thread.sleep(500);
		logOut.click();
	}
}
