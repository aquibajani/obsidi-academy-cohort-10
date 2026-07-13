package com.bptn.course.day_03;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int pin;
        boolean accessGranted = false;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their PIN.
        System.out.print("Enter your 4-digit PIN: ");
        pin = scanner.nextInt();
        attempts++;
        
        do{
          if(pin == CORRECT_PIN){
            accessGranted = true;
            break;
          } else {
            System.out.println("Incorrect PIN. Try again.");
          }
          System.out.print("Enter your 4-digit PIN: ");
          pin = scanner.nextInt();
          attempts++;
        } while(attempts < 3);

        if(accessGranted){
          System.out.println("Access granted. Welcome!");
        } else {
          System.out.println("Incorrect PIN. Account locked.");
        }
        
        scanner.close();
    }
}
