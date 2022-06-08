package CrossBrowser_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaKite_pom2_pinPage 
{
//1.find elements
	@FindBy(id = "pin") private WebElement enterPin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickContinue;
	
	//2.declare constructor
	public ZerodaKite_pom2_pinPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//3.call method
	
	public void enterPin(String pin) 
	{
		enterPin.sendKeys(pin);	
	}
	
	public void clickOnContinueButton()
	{
		 clickContinue.click();
	}
	
}
