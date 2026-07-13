package com.bptn.course.day_06_Vehicles;

public class ElectricBike extends Vehicle implements ElectricPowered {
	
	double batteryLevel;

	public ElectricBike(String make, String model, int year) {
		super(make, model, year);
		this.batteryLevel = 75.0;
	}

	@Override
	public void charge(double kWh) {
		System.out.println("Charging " + kWh + " kWh of battery.");
		this.batteryLevel += kWh;
	}

	@Override
	public double getBatteryLevel() {
		return this.batteryLevel;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting the electric bike engine...");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stopping the electric bike engine...");
	}

	@Override
	public void drive() {
		System.out.println("Riding the electric bike...");
		this.batteryLevel -= 2.0; // Assume riding consumes 2 kWh of battery
	}

}
