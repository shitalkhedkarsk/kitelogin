package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_facebook {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedrivver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
//		un.sendKeys("snk.2945@gmail.com");
		Thread.sleep(500);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
//		pw.sendKeys("shitalkk@123#");
		
		
		
		//2.connect excel path
		FileInputStream fb=new FileInputStream("F:\\Excel-Data\\facebook_login.xlsx");
		
		//3.create sheet
		Sheet fb2 = WorkbookFactory.create(fb).getSheet("sheet1");
		
		//
		int rowValue  =fb2.getLastRowNum();
		//System.out.println("row value is "+rowValue); //row>>0-3
		
		
		
		
		
		//4.call row and column
		
		for(int i=0;i<=rowValue;i++)
		{
			short newcellValue = fb2.getRow(0).getLastCellNum();
			
			for(int j=0;j<=newcellValue-1;j++)
			{
				if(j==0) {
				String op = fb2.getRow(i).getCell(j).getStringCellValue();
				un.sendKeys(op);
				System.out.println(op);
				Thread.sleep(1000);
			}
				else {
					String opp = fb2.getRow(i).getCell(j).getStringCellValue();
					pw.sendKeys(opp);
					System.out.println(opp);
					Thread.sleep(1000);
				}
		}
			un.clear();
			Thread.sleep(1000);
			pw.clear();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
