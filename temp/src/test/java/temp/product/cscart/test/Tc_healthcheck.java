package temp.product.cscart.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import temp.product.cscart.pom.POM_Base_search;
import temp.product.cscart.util.Browser_manager;

public class Tc_healthcheck 
{
	
  @Test
  
	public void t_01_cscart_search(String browser,String url) 
	{
	  	WebDriver driver=Browser_manager.getDriver(browser,url);
	  	
	  	
	  	POM_Base_search obj = PageFactory.initElements( driver,POM_Base_search.class) ;
	  	obj.searchAppProduct("bananaa");
	}
}
