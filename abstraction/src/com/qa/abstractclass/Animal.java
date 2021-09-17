package com.qa.abstractclass;

public abstract class Animal {

	private int age;
	private int numOfLegs;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNumOfLegs() {
		return numOfLegs;
	}
	
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	public abstract void eat();
	
	public abstract void makeNoise();
	
	public void sleep() {
		System.out.println("Zzzz");
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", numOfLegs=" + numOfLegs + "]";
	}

}
