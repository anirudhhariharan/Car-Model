package com.anirudh.java.carmodel;

public class Ac {
	
	private int temperature;
	
	public Ac() {
		temperature = 0;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void increaseTemperature() {
		temperature = temperature + 1;
	}
	
	public void decreaseTemperature() {
		temperature = temperature - 1;
	}

}
