package com.qa.generics;

public class Generics<T> {

	public T doSomething(T obj) {
		return obj;
	}
	
	public static void main(String[] args) {
		Generics<Shape> g = new Generics<Shape>();
		Generics<String> gs = new Generics<String>();
		
		Shape shape = new Shape();
		
		Shape newShape = g.doSomething(shape);
		
		String myString = gs.doSomething("String");
		
	}
}
