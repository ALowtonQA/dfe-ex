package com.qa.abstractclass;

public class Dog extends Animal {
	
	private boolean isPanting;
	
	public Dog(int age, int numOfLegs, boolean isPanting) {
		this.setAge(age);
		this.setNumOfLegs(4);
		this.isPanting = isPanting;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}

	@Override
	public void makeNoise() {
		System.out.println("Barks loudly!");
	}

	@Override
	public void eat() {
		System.out.println("Inhales food instantly");	
	}
	
	@Override
	public String toString() {
		return "Dog [age = " + this.getAge() + ", numOfLegs = " + this.getNumOfLegs() + ", isPanting = " + isPanting + "]";
	}
}
