package com.qa.inheritance;

public class Farmer extends Person{
	private int farmSize;
	
	public Farmer(String name, int age, int farmSize) {
		this.setName(name);
		this.setAge(age);
		this.farmSize = farmSize;
	}
	
	public void startTractor() {
		System.out.println("Engine starts...");
	}

	public int getFarmSize() {
		return farmSize;
	}

	public void setFarmSize(int farmSize) {
		this.farmSize = farmSize;
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps until sunrise...");
	}
	
	@Override
	public String toString() {
		return "Farmer [name= " + this.getName() + ", age= " + this.getAge() + ", farmSize= " + farmSize + "acres]";
	}
}
