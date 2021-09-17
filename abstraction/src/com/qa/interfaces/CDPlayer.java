package com.qa.interfaces;

public class CDPlayer implements MusicPlayer {

	@Override
	public void playTrack() {
		System.out.println("Plays track in low quality");
		
	}

	@Override
	public void pauseTrack() {
		System.out.println("Pauses... if the button works");
	}
}
