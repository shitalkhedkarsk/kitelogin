package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("F:\\\\Excel-Data\\\\zerodaDDF.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");
//		String data1 = mySheet.getRow(0).getCell(0).getStringCellValue();
//		String data2 = mySheet.getRow(0).getCell(1).getStringCellValue();
//		String data3 = mySheet.getRow(0).getCell(2).getStringCellValue();

		int totalRowNum = mySheet.getLastRowNum();
		int totalCellNo = mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalRowNum;i++)
		{
			for(int j=0;j<=totalCellNo;j++)
			{
				Cell info = mySheet.getRow(i).getCell(j);
				CellType type = info.getCellType();//boolean,string,numeric
				Row value2 = null;
				Object tp = value2.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				
				if(type==CellType.STRING)
				{
					String value = info.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.println(tp);
				}
				
				else if(type==CellType.NUMERIC)
				{
					double value = info.getNumericCellValue();
					System.out.print(value+" ");			}
				else if(type==CellType.BOOLEAN)
				{
					boolean value = info.getBooleanCellValue();
					System.out.print(value+" ");
				}
				
				
				
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
