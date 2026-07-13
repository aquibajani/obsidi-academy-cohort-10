package com.bptn.course.day_06_Vehicles;

public class VehicleManager {

	public static void main(String[] args) {
		Car myCar = new Car("Honda", "Civic", 2023);
		myCar.displayBasicInfo();
		myCar.startEngine();
		myCar.drive();
		myCar.refuel(20.0);
		System.out.println("Fuel Level: " + myCar.getFuelLevel() + " litres;");
		myCar.stopEngine();
		
		ElectricBike myBike = new ElectricBike("Trek", "E-Caliber", 2024);
		myBike.displayBasicInfo();
		myBike.startEngine();
		myBike.drive();
		myBike.charge(10.0);
		System.out.println("Battery Level: " + myBike.getBatteryLevel() + " kWh;");
		myBike.stopEngine();
		
		FuelConsuming fuelVehicle = new Car("Toyota", "Corolla", 2022);
		fuelVehicle.refuel(15.0);
		System.out.println("Fuel Level: " + fuelVehicle.getFuelLevel() + " litres");
		
		ElectricPowered electricVehicle = new ElectricBike("Specialized", "Turbo Levo", 2023);
		electricVehicle.charge(5.0);
		System.out.println("Battery Level: " + electricVehicle.getBatteryLevel() + " kWh");

	}

}
