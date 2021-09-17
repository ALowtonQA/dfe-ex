package com.qa.interfaces.vehicleexercise;

import com.qa.interfaces.vehicleexercise.interfaces.SunRoof;
import com.qa.interfaces.vehicleexercise.interfaces.Vehicle;

public class Car implements Vehicle, SunRoof {

	@Override
	public void accelerate() {
		System.out.println("Presses down the accelerator");
	}

	@Override
	public void slowDown() {
		System.out.println("Press down the break pedal");
	}

	@Override
	public void openSunRoof() {
		System.out.println("Sun roof opens...");
	}

	@Override
	public void closeSunRoof() {
		System.out.println("Sun roof closes...");
	}
}
