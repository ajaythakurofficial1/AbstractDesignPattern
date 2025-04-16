package com.nt.AbstractDesignPattern;

public class EmployeeFactory {
  
	public static Employee getEmployee(AbstractFactory factory) {
		return factory.createEmployee();//android factory class
	}
	
}
