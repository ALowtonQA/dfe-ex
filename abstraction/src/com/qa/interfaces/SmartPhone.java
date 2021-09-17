package com.qa.interfaces;

public class SmartPhone implements GPS, MusicPlayer {

	@Override
	public void playTrack() {
		System.out.println("plays track in high quality...");
	}

	@Override
	public void pauseTrack() {
		System.out.println("pause track...");
	}

	@Override
	public void loadMap() {
		System.out.println("map loaded in 4k...");
	}

	@Override
	public void showLocation() {
		System.out.println("Location displayed accurately...");
	}
}
