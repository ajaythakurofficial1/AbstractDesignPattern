package com.nt.AbstractDesignPattern;

public class Main {

	public static void main(String[]args) {
		
		Employee emp=EmployeeFactory.getEmployee(new AndroidFactory());
		Employee emp1=EmployeeFactory.getEmployee(new WebDeveloperFactory());

		System.out.println(emp.name());
		System.out.println(emp.Salary());
		
		
		System.out.println(emp1.name());
		System.out.println(emp1.Salary());
	}
}
