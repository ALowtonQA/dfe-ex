package com.qa.liskov.animal;

public class Runner {

	public static void main(String[] args) {
		Animal a = new Animal();
		Owl owl = new Owl();
		Penguin penguin = new Penguin();
		
		try {
			a.learnToFly(owl);
			a.learnToFly(penguin);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
