package com.qa.polymorphism;

import java.util.List;

public class Printer {

	public void printArea(Shape shape) {
		shape.area();
	}
	
	public void printAreas(List<Shape> shapes) {
		for (Shape shape : shapes) {
			shape.area();
		}
	}
}
