package com.qa.interfaces.vehicleexercise;

import com.qa.interfaces.vehicleexercise.interfaces.EcoFriendly;
import com.qa.interfaces.vehicleexercise.interfaces.Vehicle;

public class Bicycle implements Vehicle, EcoFriendly {

	@Override
	public void accelerate() {
		System.out.println("Pedals fast");
		
	}

	@Override
	public void slowDown() {
		System.out.println("Squeezes break");
		
	}

	@Override
	public void ecoFriendly() {
		System.out.println("This vehicle is extremely eco-friendly");
	}

}
