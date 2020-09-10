package com.anirudh.java.carmodel;

public class Wheel {
	
	private int diameter;
	private int numberOfspokes;
	private int rotationPerminute;
	
	public Wheel() {
		diameter = 10;
		numberOfspokes = 20;
		rotationPerminute = 0;			
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public int getNumberOfspokes() {
		return numberOfspokes;
	}
	public void setNumberOfspokes(int numberOfspokes) {
		this.numberOfspokes = numberOfspokes;
	}
	public int getRotationPerminute() {
		return rotationPerminute;
	}
	public void setRotationPerminute(int rotationPerminute) {
		this.rotationPerminute = rotationPerminute;
	}
	
	public void increaseRotationperminute() {
		rotationPerminute = rotationPerminute + 20;
	}
	
	public void decreaseRotationperMinute() {
		rotationPerminute = rotationPerminute - 20;
	}
	

}
