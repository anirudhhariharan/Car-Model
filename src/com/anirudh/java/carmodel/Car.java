package com.anirudh.java.carmodel;

public class Car {
	
	private Wheel leftFront;
	private Wheel rightFront;
	private Wheel leftRear;
	private Wheel rightRear;
	private Ac ac;
	private MusicPlayer mp;
	private Engine engine;
	
	public Car() {
		leftFront = new Wheel();
		rightFront = new Wheel();
		leftRear = new Wheel();
		rightRear = new Wheel();
		ac = new Ac();
		mp = new MusicPlayer();
		engine = new Engine();
	}
	public Wheel getLeftFront() {
		return leftFront;
	}

	public void setLeftFront(Wheel leftFront) {
		this.leftFront = leftFront;
	}

	public Wheel getRightFront() {
		return rightFront;
	}

	public void setRightFront(Wheel rightFront) {
		this.rightFront = rightFront;
	}

	public Wheel getLeftRear() {
		return leftRear;
	}

	public void setLeftRear(Wheel leftRear) {
		this.leftRear = leftRear;
	}

	public Wheel getRightRear() {
		return rightRear;
	}

	public void setRightRear(Wheel rightRear) {
		this.rightRear = rightRear;
	}

	public Ac getAc() {
		return ac;
	}

	public void setAc(Ac ac) {
		this.ac = ac;
	}

	public MusicPlayer getMp() {
		return mp;
	}

	public void setMp(MusicPlayer mp) {
		this.mp = mp;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void speedUp() {
		leftFront.increaseRotationperminute();
		rightFront.increaseRotationperminute();
		leftRear.increaseRotationperminute();
		rightRear.increaseRotationperminute();
	}
	
	public void slowDown() {
		leftFront.decreaseRotationperMinute();
		rightFront.decreaseRotationperMinute();
		leftRear.decreaseRotationperMinute();
		rightRear.decreaseRotationperMinute();
	}
	
	public void heatUp() {
		ac.increaseTemperature();
	}
	
	public void coolDown() {
		ac.decreaseTemperature();
	}
	
	public void volumeIncrease() {
		mp.increaseVolume();
	}
	
	public void volumeDecrease() {
		mp.decreaseVolume();
	}
	
	
	

}
