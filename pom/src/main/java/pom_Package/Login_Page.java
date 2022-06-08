package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	
	@FindBy(xpath="//input[@type='email']") private WebElement user_name;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement sign_in;
	  
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void user_login()
	{
		user_name.sendKeys("snk.2945@gmail.com");
	}
	public void enter_password()
	{
		password.sendKeys("shitalkalu");
	}
	public void signin_app()
	{
		sign_in.click();
	}
	
	

	
}
