package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		
		//System.out.println(value);
		//use for loop
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		
		}
		
		
		
		
		
		
		
	}

}
