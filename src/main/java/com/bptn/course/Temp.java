package com.bptn.course;
import java.util.Scanner;

public class Temp {
		

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        int choice;

	        do {
	            // Display menu
	            System.out.println("\nPress 1 for Palindrome Check");
	            System.out.println("Press 2 to Reverse a String");
	            System.out.println("Press 3 for String Comparison");
	            System.out.print("Enter your selection: ");

	            //read user input
	            choice = input.nextInt();
	            input.nextLine(); // consuming the enter key
	            
	            //switch case based on user input
	            switch (choice) {

	                case 1:
	                  System.out.print("\nEnter a String: ");
	                  String palindromeString = input.nextLine();

	                  String reversed = "";

	                  //reverses the entered string
	                  for (int i = palindromeString.length() - 1; i >= 0; i--) {
	                      reversed += palindromeString.charAt(i);
	                  }

	                  //verifies if entered string is a palindrome
	                  if (palindromeString.equals(reversed)) {
	                      System.out.println(palindromeString + " is a palindrome.");
	                  } else {
	                      System.out.println(palindromeString + " is not a palindrome.");
	                  }

	                  break;


	                case 2:
	                    // Reverse a string
	                    System.out.print("Enter a String: ");
	                    String original = input.nextLine();

	                    String reverseString = "";

	                    // Build reversed string
	                    for (int i = original.length() - 1; i >= 0; i--) {
	                        reverseString += original.charAt(i);
	                    }

	                    System.out.println(original + " reversed is " + reverseString);

	                    break;


	                case 3:
	                    // String comparison
	                    System.out.print("Enter the first String: ");
	                    String firstString = input.nextLine();

	                    System.out.print("Enter the second String: ");
	                    String secondString = input.nextLine();

	                    // Compare strings 
	                    if (firstString.equals(secondString)) {
	                        System.out.println("The entered Strings are equal.");
	                    } else {
	                        System.out.println("The entered Strings are not equal.");
	                    }

	                    break;


	                default:
	                    System.out.println("Invalid choice! Please make a valid choice!");
	            }

	        } while (choice >= 1 && choice <= 3);

	        input.close();
	    }
	}
