package com.anirudh.java.carmodel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println(car.getLeftFront().getRotationPerminute());
		System.out.println(car.getAc().getTemperature());
		car.heatUp();
		car.speedUp();
		System.out.println(car.getLeftFront().getRotationPerminute());
		System.out.println(car.getAc().getTemperature());
			
		

	}

}
