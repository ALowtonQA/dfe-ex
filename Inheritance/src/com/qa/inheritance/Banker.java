package com.qa.inheritance;

public class Banker extends Person{
	private int officeSize;
	
	public Banker(String name, int age, int officeSize) {
		this.setName(name);
		this.setAge(age);
		this.officeSize = officeSize;
	}
	
	public void cashCheque() {
		System.out.println("Cha-ching");
	}

	public int getOfficeSize() {
		return officeSize;
	}

	public void setOfficeSize(int officeSize) {
		this.officeSize = officeSize;
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps 3 hours...");
	}
	
	@Override
	public String toString() {
		return "Banker [name= " + this.getName() + ", age= " + this.getAge() + ", officeSize= " + officeSize + "square meters]";
	}
}
