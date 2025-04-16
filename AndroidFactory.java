package com.nt.AbstractDesignPattern;

public class AndroidFactory extends AbstractFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
