package com.qa.polymorphism;

public class Triangle extends Shape {
	
	@Override
	public void area() {
		System.out.println("Triangle is 0.5 * base * height ");
	}
	
}