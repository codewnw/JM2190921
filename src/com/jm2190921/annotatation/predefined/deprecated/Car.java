package com.jm2190921.annotatation.predefined.deprecated;

public class Car {

	@Deprecated
	public void start() {
		System.out.println("Car is started.");
	}
	
	public void remoteStart() {
		System.out.println("Car is started by remote.");
	}

	@Deprecated
	public void move() {
		System.out.println("Car is moving...");
	}
	
	public void fly() {
		System.out.println("Car is flying.");
	}

	public void stop() {
		System.out.println("Car is stopped.");
	}
}
