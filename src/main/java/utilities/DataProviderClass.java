package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	//1. You need to know Excel workbook path
	//2. You need to sheet num or sheet name
	//3. need to identify how many number of rows
	//4. need to identify how many number of columns
	//5. Navigate to each row and column, get the data and return the data
	                           
	
	@DataProvider(name="fetchData1")
	public static String[][] getDataFromExcelSheetTC001(String dataSheetName) throws IOException{
		// apache POI + Data Provider
		FileInputStream fis = new FileInputStream("./testData/"+dataSheetName+".xlsx");  //1. TO load the file
		XSSFWorkbook wb = new XSSFWorkbook(fis);                             // to open excel work book
		XSSFSheet sheet = wb.getSheetAt(1); 								 // to navigate to respective sheet
		int rc = sheet.getLastRowNum();                                      // to get row count
		int cc = sheet.getRow(0).getLastCellNum();                           // to get column count
		
		System.out.println("ROw Count :- "+rc);
		System.out.println("Column Count :- "+cc);
		String[][] data = new String[rc][cc];
				
		for(int i=1; i<=rc; i++){
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<cc; j++){
				
				String cellValue = row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
				
			}
		}
		
				return data;
	
	}
		
		
}