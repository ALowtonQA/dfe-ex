package com.qa.liskov.exercise;

public class BedroomAdder {
	
	public void addSqft(Apartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 40);
	}
	
	public void addBedroom(Penthouse penthouse) {
		addSqft(penthouse);
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
	}	
}