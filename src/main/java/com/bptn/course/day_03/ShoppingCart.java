package com.bptn.course.day_03;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("How many items are you buying? ");
        int itemCount = scanner.nextInt();

        for(int i=0; i < itemCount; i++){
          System.out.print("Enter price for item "+(i+1)+": ");
          double tempItemPrice = scanner.nextDouble();
          total += tempItemPrice;
        }

        System.out.printf("\nTotal amount: $%.2f%n", total);
        scanner.close();
    }
}