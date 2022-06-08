package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
//1.
	@FindBy(xpath="//a[@class='kite-login']") private WebElement home;

//2.constructor
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

public void clickonHomePageButton()
{
	home.click();
}










}
