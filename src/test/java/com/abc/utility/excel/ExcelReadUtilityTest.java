package com.abc.utility.excel;

import java.util.List;

public class ExcelReadUtilityTest {

	public static void main(String[] args) {
		
		String filePath = "src/test/java/com/abc/utility/excel/SampleExcelData.xlsx";
		
		List<Employee> employeeList = ExcelReadUtility.readEmployeeData(filePath);
		
		for(Employee emp : employeeList ) {
			System.out.println(emp);
		}

	}

}
