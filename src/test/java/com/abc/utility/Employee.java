package com.abc.utility;

public class Employee {
		
		String employeeID = null;
		String name = null;
		String department = null;
		double salary = 0;
		
		public Employee(String employeeID, String name, String department, double salary) {
			
			this.employeeID = employeeID;
			this.name = name;
			this.department = department;
			this.salary = salary;
						
		}
		
		public String toString() {
			return "ID :  " + employeeID + ", Name: " + name + ", department: " + department + ", salary: "+salary;
		}
	

}
