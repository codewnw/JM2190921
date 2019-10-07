package com.jm2190921.annotatation.predefined.suppresswarnings;

public class Driver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.move();
		car.stop();
	}

}
