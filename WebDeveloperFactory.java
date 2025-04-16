package com.nt.AbstractDesignPattern;

public class WebDeveloperFactory extends AbstractFactory {

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}
