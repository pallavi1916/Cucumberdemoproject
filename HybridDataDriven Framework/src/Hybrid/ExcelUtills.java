package Hybrid;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtills 
{
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void setexcelfile(String path,String sheetName)throws Exception
	{
		
		// open /read excelsheet 
		FileInputStream fis =new FileInputStream(path);
		
		 wb=new XSSFWorkbook(fis);
		
		 sheet =wb.getSheet(sheetName);
		
			
	}
	public static String getCellData(int row, int coloum)
	
	{
		// get excel data
		XSSFCell cell =sheet.getRow(row).getCell(coloum);	
		
		String cellData=cell.getStringCellValue();
		return cellData;
		
		
}
}
