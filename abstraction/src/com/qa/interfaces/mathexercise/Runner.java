package com.qa.interfaces.mathexercise;

public class Runner {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		int sum = myCalculator.sumOfDivisors(1000);
		System.out.println(sum);
	}
	
}
