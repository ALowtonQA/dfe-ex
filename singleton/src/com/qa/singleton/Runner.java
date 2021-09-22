package com.qa.singleton;

public class Runner {

	public static void main(String[] args) {
		Singleton singletonOne = Singleton.getInstance();
		
		//"Default information" will be printed
		System.out.println(singletonOne.getInfo());
		
		// Let's make a second one to prove that the JVM won't allow more than one instance of the class to exist
		Singleton singletonTwo = Singleton.getInstance();
	
		//Set some new information using the second variable
		singletonTwo.setInfo("New information");
		
		//"New information" will be printed, as expected
		System.out.println(singletonTwo.getInfo()); 

		//"New information" will be printed, as expected
		System.out.println(singletonOne.getInfo());
		
	}
}
