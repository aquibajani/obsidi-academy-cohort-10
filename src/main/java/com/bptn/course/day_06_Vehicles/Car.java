package com.bptn.course.day_06_Vehicles;

public class Car extends Vehicle implements FuelConsuming {
	
	double fuelLevel;
	
	public Car(String make, String model, int year) {
		super(make, model, year);
		this.fuelLevel = 50.0;
	}

	@Override
	public void refuel(double litres) {
		System.out.println("Refueling " + litres + " litres of fuel.");
		this.fuelLevel += litres;
	}

	@Override
	public double getFuelLevel() {
		return this.fuelLevel;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting the car engine...");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stopping the car engine...");
	}

	@Override
	public void drive() {
		System.out.println("Driving the car...");
		this.fuelLevel -= 5.0; // Assume driving consumes 5 litres of fuel
	}
}