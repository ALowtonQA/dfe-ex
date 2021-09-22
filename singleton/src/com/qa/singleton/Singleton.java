package com.qa.singleton;

public class Singleton {

	private static Singleton INSTANCE;
	private String info = "Default information";

	private Singleton() {
		// this is our private constructor
	}
	
	public static Singleton getInstance() {
		// this is our static creation method
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
