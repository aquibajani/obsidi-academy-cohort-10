package com.bptn.course.day_07.WorkingWithSuperKeyword;

public class Bike extends Vehicle{

	   //Declare an instance variable- String bikeHandle
	   String bikeHandle;

	   //add parameterized constructor- use super keyword to call parent constructor
	   Bike(String colour, String brand, String bikeHandle) {
		   super(colour, brand);
		   this.bikeHandle = bikeHandle;
	   }
	   
	   @Override
	   public void print() {
		   super.print();
		   System.out.println("Bike Handle: " + this.bikeHandle);
	   }

	}