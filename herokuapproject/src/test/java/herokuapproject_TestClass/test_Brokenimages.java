package herokuapproject_TestClass;




import java.io.IOException;

import java.time.Duration;
import java.util.List;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import herokuapproject_Base_class.Base_class;

public class test_Brokenimages  extends Base_class
{
	int invalidImageCount=0;
	public static String status="passed";
	@BeforeClass
	public void testSetup() throws IOException
	{
		launchBrowser("http://the-internet.herokuapp.com/broken_images");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	 @Test(description = "Approach 1: find broken imAGE ON WEBPAGE ",enabled = true)
	  public  void selenium_broken_image_approach_1() 
	 {
		 try {
			 //invalidImageCount=0;
			 List<WebElement> images_list = driver.findElements(By.tagName("img"));
				System.out.println("The page under test has "+images_list.size()+" images");
				
				 //traverse through each image
				for(WebElement img:images_list)
				{
					if(img !=null)
					{
						CloseableHttpClient client = HttpClientBuilder.create().build();
						 HttpGet request = new HttpGet(img.getAttribute("src"));
						 CloseableHttpResponse response = client.execute(request);
						 //valid image response code is 200
						 if(response.getStatusLine().getStatusCode()!=200)
						 {
							 System.out.println(img.getAttribute("outerHTML")+" is broken");
							 invalidImageCount++;
						 }
					}
					
					
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			status="failed";
			System.out.println(e.getMessage());
		}
		 status="passed";
		 System.out.println("page having "+invalidImageCount+" broken images");
			 
	  }
	 @Test(description = "Approach2:")
	 public  void selenium_broken_image_approach_2() 
	 {
		 try {
			 List<WebElement> image_list = driver.findElements(By.tagName("img"));
			 System.out.println("the page under test has "+image_list.size()+" images");
			 for(WebElement img:image_list)
			 {
				 if(img!=null)
				 {
					 if(img.getAttribute("naturalWidth").equals("0"))
					 {
						 System.out.println(img.getAttribute("outerHTML")+" is broken.");
						 invalidImageCount++;
					 }
				 }
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			status="failed";
			System.out.println(e.getMessage());
		}
		 status="passed";
		 System.out.println("the page having "+invalidImageCount+" broken images");
	 }
	 @AfterClass
	 public void tearDown()
	 {
		 driver.close();
	 }
	
}


