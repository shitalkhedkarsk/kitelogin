package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage3 
{
		//1.variable declare
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
		//2.constructor
		public KiteHomePage3(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//3.methods
		public void checkUserId()
		{
			
			String actualUserId = userId.getText();
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
			userId.click();
			Thread.sleep(500);
			logOut.click();
		}
		
		
		
		
		
		
		
		
		
		
		
}
