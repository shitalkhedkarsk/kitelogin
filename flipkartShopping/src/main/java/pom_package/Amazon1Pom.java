package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon1Pom 
{
	@FindBy(xpath= "//input[@data-action-type='DISMISS']") private WebElement popup;
	@FindBy( xpath = "(//span[@class='nav-line-1 nav-progressive-content'])[2]") private WebElement userName;
	
	public Amazon1Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void popuphandling()
	{
		popup.click();
	}
	public void clickOnUser()
	{
		userName.click();
		
	}
}
