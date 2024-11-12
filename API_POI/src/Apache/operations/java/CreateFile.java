package Apache.operations.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

	public class CreateFile {
	public static void main(String[] args) throws IOException{
		/*
		 * create a excel file and set test inputs
		 * and perform all the regarding operations
		 * 
		 * File class
		 * FileOutputStream
		 */
		
		File f=new File("src/Apache/operations/java/TestData/Capgemini.xls");
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("File1 is successfully written");
		
		File f1=new File("src/Apache/operations/java/TestData/Employee.xls");
		FileOutputStream fo=new FileOutputStream(f1);
		System.out.println("File2 is successfully written");
		
		
	}
	}


