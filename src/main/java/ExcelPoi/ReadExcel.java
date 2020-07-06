package ExcelPoi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadExcel {
	@DataProvider(name="Exceldata")
	public static Object[][] readExcel() throws InvalidFormatException, IOException{
		
		Object[][] data;
		File src = new File("./data/CreateLead.xlsx");
		XSSFWorkbook  wb = new XSSFWorkbook(src);
		XSSFSheet ws = wb.getSheetAt(0);
		
		//getrowcount
	     int rowcount = ws.getLastRowNum();
	     
	     //getcolumncount
		int columncount = ws.getRow(0).getLastCellNum();
		
		data=new Object[rowcount][columncount];
		
		for (int i = 0; i < rowcount;i++)
		{
			XSSFRow row =	ws.getRow(i);
			
			for (int j = 0; j <= columncount; j++ )
			{
				XSSFCell cell = row.getCell(j);
				
			data[i][j] = cell.getStringCellValue();
			}
			
		}
		
		wb.close();
		return data;
		
		
		
	}

}
