package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//file path
		FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\Book1.xlsx");
		
//		String value = WorkbookFactory.create(myFile).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
//				
//		System.out.println(value);
//		
		//2.
		String value2 = WorkbookFactory.create(myFile).getSheet("sheet2").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
