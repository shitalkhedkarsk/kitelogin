package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	
	public static String readDataFromExcelSheet(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
		Sheet f1 = WorkbookFactory.create(f).getSheet("Sheet1");
		String value = f1.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
	}
	
	public static void takeScreenshotForTest(WebDriver driver) throws IOException
	{
		
		TakesScreenshot a = ((TakesScreenshot)driver);
		File src = a.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\screenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("Screenshot taken....",true);
		
		
	}
	
	
	
	
	
	
	
	
}
