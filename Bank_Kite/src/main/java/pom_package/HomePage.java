package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(id="userid") private WebElement id;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterId(String uId)
	{
		id.sendKeys(uId);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		login.click();
	}
}
