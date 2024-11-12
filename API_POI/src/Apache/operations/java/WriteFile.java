package Apache.operations.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFile {
	
	static File f,f1;
	static HSSFWorkbook wb,wb1;
	static HSSFSheet sheet,sheet1;
	static HSSFRow row,row1,row2;
	static HSSFCell cell,cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8;
	static FileOutputStream fos,fo;
	
public static void main(String[] args) throws FileNotFoundException {
	
	
	//for file 1
	f=new File("src/Apache/operations/java/TestData/Capgemini.xls");
	wb=new HSSFWorkbook();
	
	sheet=wb.createSheet("LoginCredentials");
	
	row=sheet.createRow(0);
	
	cell=row.createCell(0);
	cell1=row.createCell(1);
	cell2=row.createCell(2);
	
	//set inputs in cell0, row0
	cell.setCellValue("Sowsil@gamil.com");
	cell1.setCellValue("563726");
	cell2.setCellValue("Bengaluru");
	
	
	System.out.println("Name of the sheet: "+sheet.getSheetName());
	fos=new FileOutputStream(f);
	try {
		wb.write(fos);
		System.out.println("Data written successfully");
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	//for file2
	f1=new File("src/Apache/operations/java/TestData/Employee.xls");
	wb1=new HSSFWorkbook();
	sheet1=wb1.createSheet("EmployeeDetails");
	
	//row 1
	row1=sheet1.createRow(0);
	
	cell3=row1.createCell(0);
	cell4=row1.createCell(1);
	cell5=row1.createCell(2);
	
	cell3.setCellValue("ID");
	cell4.setCellValue("Name");
	cell5.setCellValue("City");
	
	//row 2
    row2=sheet1.createRow(1);
	
	cell6=row2.createCell(0);
	cell7=row2.createCell(1);
	cell8=row2.createCell(2);
	
	cell6.setCellValue("101");
	cell7.setCellValue("vijay");
	cell8.setCellValue("pune");
	System.out.println(cell6.getStringCellValue());
	System.out.println(cell7.getStringCellValue());
	System.out.println(cell7.getStringCellValue());
	
	System.out.println("Name of the sheet: "+sheet1.getSheetName());
	fo=new FileOutputStream(f1);
	try {
		wb1.write(fo);
		
		System.out.println("Data written successfully");
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	int NoOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println("No.of Rows: "+NoOfRows);
	
	int NoOfCells = row.getPhysicalNumberOfCells();
	System.out.println("No.of Cells: "+NoOfCells);
	
	for(int i=0;i<NoOfCells;i++) {
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	}
	
	
	
}
}


