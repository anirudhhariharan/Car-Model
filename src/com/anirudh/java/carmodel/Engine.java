package com.anirudh.java.carmodel;

public class Engine {
	
	private int horsePower;
	
	public Engine() {
		horsePower = 0;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void increasepower() {
		horsePower = horsePower + 10;
	}
	
	public void decreasepower() {
		horsePower = horsePower - 10;
	}
	
	

}
