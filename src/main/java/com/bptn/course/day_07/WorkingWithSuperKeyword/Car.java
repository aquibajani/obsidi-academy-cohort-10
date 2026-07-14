package com.bptn.course.day_07.WorkingWithSuperKeyword;

public class Car extends Vehicle {

	   //instance variable 
	   String steeringWheel;

	   //add parameterized constructor- use super keyword to call parent constructor
	   Car(String colour, String brand, String steeringWheel) {
		   super(colour, brand);
		   this.steeringWheel = steeringWheel;
	   }
	   
	   @Override
	   public void print() {
		   super.print();
		   System.out.println("Steering Wheel: " + this.steeringWheel);
	   }

	}