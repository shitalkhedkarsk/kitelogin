package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1
{
	//1.variable declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy(xpath = "//input[@id='password']") private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//2.constructor
	public  KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void sendUserId()
	{
		userId.sendKeys("DAA677");
	}
	public void sendPassword()
	{
		passWord.sendKeys("Velocity@123");
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
