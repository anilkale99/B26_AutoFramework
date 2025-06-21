package com.abc.utility.excel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReadUtility {

		public static  List<Employee> readEmployeeData (String excelFilePath) {
			
			List<Employee> employees = new ArrayList<Employee>();
			
			try (FileInputStream fis = new FileInputStream(excelFilePath); Workbook workbook = new XSSFWorkbook(fis) ){
				
				org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
				
				for (int i = 1;  i <= sheet.getLastRowNum(); i++) {
					
					Row row = sheet.getRow(i);
					
					String employeeID = row.getCell(0).getStringCellValue();
					String name = row.getCell(1).getStringCellValue();
					String department = row.getCell(2).getStringCellValue();
					double salary = row.getCell(3).getNumericCellValue();
					
					employees.add(new Employee(employeeID, name, department, salary));
				}
				
			}
			
			catch(IOException e) {
				e.printStackTrace();
			}
			
			return employees;
					
			
		}
	
}
