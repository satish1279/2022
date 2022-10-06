package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider0510 {

	public FileInputStream fis;
	public XSSFWorkbook wb;

	public XSSFSheet sheet;

	public XSSFRow row;
	public XSSFCell cell;

	String Path=null;


	 public DataProvider0510(String Path){

		this.Path=Path;
	}

	public int getRowCount(String sheetName) throws IOException {


		fis= new FileInputStream(Path);
		wb= new XSSFWorkbook(fis);
		sheet=wb.getSheet("testData");

		
		int rowCount= sheet.getLastRowNum();

		wb.close();
		fis.close();

		return rowCount;
	}




	public int getCellCount(String sheetName, int rownum) throws IOException {


		fis= new FileInputStream(Path);
		wb= new XSSFWorkbook(fis);
		sheet=wb.getSheet("testData");
		
		row= sheet.getRow(rownum);
		
		
		int cellCount= row.getLastCellNum();

		wb.close();
		fis.close();

		return cellCount;
	}




	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {

		fis= new FileInputStream(Path);
		wb= new XSSFWorkbook(fis);
		sheet=wb.getSheet("testData");
		row= sheet.getRow(rownum);
		cell= row.getCell(colnum);


		DataFormatter formatter= new DataFormatter();
		String cellData= formatter.formatCellValue(cell);

		
		wb.close();
		fis.close();

		return cellData;

	}



}



