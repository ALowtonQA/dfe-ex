package com.qa.polymorphism;

import java.util.ArrayList;
import java.util.List;

class Runner {
	
	public static void main(String[] args) {
		// Shape is a Shape. Triangle is a Shape. Circle is a Shape.
		Shape myShape = new Shape(); 
		Shape myTriangle = new Triangle();
		Shape myCircle = new Circle();
		
		// They all have their overridden implementations
		myShape.area();
		myTriangle.area();
		myCircle.area();
		
		// Because Triangle "IS A" Shape and Circle "IS A" Shape, they can be passed as a Shape to a method
		Printer p = new Printer();
		p.printArea(myShape);
		p.printArea(myTriangle);
		p.printArea(myCircle);

		// They can also be stored in a list expecting Shape
		List<Shape> shapes = new ArrayList<>();
		shapes.add(myShape);
		shapes.add(myTriangle);
		shapes.add(myCircle);
		p.printAreas(shapes);
		
	}
}
