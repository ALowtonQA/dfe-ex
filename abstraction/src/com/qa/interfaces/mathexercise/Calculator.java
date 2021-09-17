package com.qa.interfaces.mathexercise;

public class Calculator implements MathsChallenge {
	
	@Override
	public int sumOfDivisors(int input) {
		int sum = input;
		for (int i = 1; i <= input / 2; i++) {
			if (input % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
}

