package com.anirudh.java.carmodel;

public class MusicPlayer {
	
	private int volume;
	
	public MusicPlayer() {
		volume = 0;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void increaseVolume() {
		volume = volume + 5;
	}
	
	public void decreaseVolume() {
		volume = volume - 5;
	}
	

}
