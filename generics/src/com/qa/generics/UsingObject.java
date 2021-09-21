package com.qa.generics;

public class UsingObject {

	public Object doSomething(Object obj) {
		return obj;
	}
	
	public static void main(String[] args) {
		UsingObject uo = new UsingObject();
		Shape shape = new Shape();
		
		Shape newShape = (Shape) uo.doSomething(shape);
		
		// Runtime error example
		String myString = (String) uo.doSomething(5);
	}
}
