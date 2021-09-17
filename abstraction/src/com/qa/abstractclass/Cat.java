package com.qa.abstractclass;

public class Cat extends Animal {

	private int whiskerLength;
	
	public Cat(int age, int whiskerLength) {
		this.setAge(age);
		this.whiskerLength = whiskerLength;
	}
	
	public Cat(int age, int numOfLegs, int whiskerLength) {
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.whiskerLength = whiskerLength;
	}
	
	public int getWhiskerLength() {
		return whiskerLength;
	}

	public void setWhiskerLength(int whiskerLength) {
		this.whiskerLength = whiskerLength;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Meow..");
	}
	
	@Override
	public void eat() {
		System.out.println("nyam nyam nyam");
		
	}
	
	@Override
	public String toString() {
		return "Cat [age=" + this.getAge() + ", numOfLegs=" + this.getNumOfLegs() + ", whiskerLength=" + whiskerLength + "]";
	}	
}
