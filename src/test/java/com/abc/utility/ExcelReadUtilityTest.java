package com.abc.utility;

import java.util.List;

public class ExcelReadUtilityTest {

	public static void main(String[] args) {
		
		String filePath = "src/test/java/com/abc/utility/SampleExcelData.xlsx";
		
		List<Employee> employeeList = ExcelReadUtility.readEmployeeData(filePath);
		
		for(Employee emp : employeeList ) {
			System.out.println(emp);
		}

	}

}
