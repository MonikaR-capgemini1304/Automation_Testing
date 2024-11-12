package Apache.operations.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Add_Value_Excel {
	
	static File f;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell,cell1,cell2,cell3;
	static FileOutputStream fos;
	
public static void main(String[] args) throws FileNotFoundException {
	f=new File("src/Apache/operations/java/XSSFTestData/AddValue.xlsx");
	
	wb=new XSSFWorkbook();
	
	sheet=wb.createSheet("AddData");
	
	row=sheet.createRow(0);
	
	cell=row.createCell(0);
	cell1=row.createCell(1);
	cell2=row.createCell(2);
	cell3=row.createCell(3);
	
	cell.setCellValue(10);
	cell1.setCellValue(cell.getNumericCellValue()+20);
	cell2.setCellValue(cell.getNumericCellValue()+cell1.getNumericCellValue());
	cell3.setCellValue(cell1.getNumericCellValue()+cell2.getNumericCellValue());
	
	
	fos=new FileOutputStream(f);
	
	try {
		wb.write(fos);
		System.out.println("Data Written");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
