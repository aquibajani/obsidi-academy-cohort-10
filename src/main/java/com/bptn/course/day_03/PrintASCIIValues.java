package com.bptn.course.day_03;

import java.util.Scanner;

public class PrintASCIIValues {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.nextLine().charAt(0);
        int ascii = c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);

        // output: The ASCII value of A is: 65
        scanner.close();
        
    }
}
