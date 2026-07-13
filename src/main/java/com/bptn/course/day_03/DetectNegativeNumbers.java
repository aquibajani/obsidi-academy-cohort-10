package com.bptn.course.day_03;

//Import the Scanner library
import java.util.Scanner;

public class DetectNegativeNumbers {
 public static void main(String[] args) {
     // Declare Variable
     int input;
     // Create Scanner Object
     Scanner scanner = new Scanner(System.in);
     // Prompt User
     System.out.println("Enter a number: ");
     // Read Input
     input = scanner.nextInt();
     // Check for Positive or Negative
     if(input > 0){
       System.out.println("The number is positive.");
     } else if(input < 0){
       System.out.println("The number is negative.");
     } else {
       System.out.println("The number is equal to zero.");
     }
 }

}

