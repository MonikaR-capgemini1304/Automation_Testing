package Apache.operations.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF_Read_File {

	/*
	 * create a workbook
	 * create a sheet    -  XSSFSheet
	 * create a row      -  XSSFRow
	 * create a cell     -  XSSFCell
	 */

	
	static File f;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row,row1,row2;
	static XSSFCell cell,cell1,cell2;
	static FileOutputStream fos;
	
	public static void main(String[] args) throws IOException {
		
		f=new File("src/Apache/operations/java/XSSFTestData/XSSFFile.xlsx");
		
		wb=new XSSFWorkbook();
		
		sheet=wb.createSheet("XSSFData");
		
		row=sheet.createRow(0);
		
		cell=row.createCell(0);
		cell.setCellValue("Finance");
		
		row1=sheet.createRow(1);
		
		cell1=row1.createCell(0);
		cell1.setCellValue("Department");
		
		row2=sheet.createRow(2);
		
		cell2=row2.createCell(0);
		cell2.setCellValue("Marketing");
		
		System.out.println(cell.getStringCellValue());
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		
		
		fos=new FileOutputStream(f);
		
		try {
			wb.write(fos);
			System.out.println("Data Written");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
