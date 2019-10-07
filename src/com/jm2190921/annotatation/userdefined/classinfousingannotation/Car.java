package com.jm2190921.annotatation.userdefined.classinfousingannotation;

@ClassInfo(author = "Atul", reviewrs = { "Dheeraj", "John" }, createdOn = "07-Oct-2019", version=2)
public class Car {

	// @ClassInfo
	private int speed;

	// @ClassInfo
	public void start() {
		System.out.println("Car is started.");
	}

	public void move() {
		System.out.println("Car is moving...");
	}

	public void stop() {
		System.out.println("Car is stopped.");
	}
}
