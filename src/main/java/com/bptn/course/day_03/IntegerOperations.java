package com.bptn.course.day_03;

import java.util.Scanner;
public class IntegerOperations {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize counters and tracking variables
        int positives = 0;
        int negatives = 0;
        int evens = 0;
        int odds = 0;
        int totalSum = 0;
        int count = 0;

        // Prompt for the first integer
        System.out.print("Enter the first integer(0 to terminate): ");
        int num = input.nextInt();

        // Loop continues until the user inputs 0
        while (num != 0) {
            count++;
            totalSum += num;

            // Determine if the number is positive or negative
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            }

            // Determine if the number is even or odd
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }

            // Prompt for the next integer
            System.out.print("Enter the next integer (0 to terminate): ");
            num = input.nextInt();
        }

        // Check if any numbers were entered before terminating
        if (count == 0) {
            System.out.println("No numbers are entered except 0.");
        } else {
            // Calculate the average (cast totalSum to double to avoid integer division)
            float average = (float) totalSum / count;

            // Print the results matching the required format
            System.out.println("The number of positives is " + positives + ".");
            System.out.println("The number of negatives is " + negatives + ".");
            System.out.println("The number of evens is " + evens + ".");
            System.out.println("The number of odds is " + odds + ".");
            System.out.println("The total is " + totalSum + ".");
            System.out.printf("The average is %.2f.\n", average);
        }

        // Close the scanner resource
        input.close();
    }
}

