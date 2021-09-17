package com.qa.interfaces.vehicleexercise;

import com.qa.interfaces.vehicleexercise.interfaces.Vehicle;

public class Van implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("Presses down the accelerator... Van slowly speeds up");
		
	}

	@Override
	public void slowDown() {
		System.out.println("Presses down the brake pedal... takes a while to slow down");
		
	}

}
