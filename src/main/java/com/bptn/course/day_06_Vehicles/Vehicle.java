package com.bptn.course.day_06_Vehicles;

public abstract class Vehicle {
	
	String make;
	String model;
	int year;
	boolean isEngineOn;
	
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.isEngineOn = false;
	}
	
	public void displayBasicInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Engine Running: " + isEngineOn);
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	public abstract void drive();

}
