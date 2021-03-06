package utility_class4;

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

public class UtilityClass_ExcelSheet 
{
	 static Sheet mySheet;
	public static  String pathForExcelSheet(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException 
	{
	//excel sheet path
			
		FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		String value = mySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
		
	}
	public static void takeScreenshot(WebDriver driver, int TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("F:\\screenshot\\kite "+TCID+".png");
		FileHandler.copy(source, destination);
		
		}
	
}
