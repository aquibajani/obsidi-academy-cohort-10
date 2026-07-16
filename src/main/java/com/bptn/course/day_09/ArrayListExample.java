package com.bptn.course.day_09;

//Import the ArrayList class from the java.util package
import java.util.ArrayList;

public class ArrayListExample {
 public static void main(String[] args) {
     // Create an ArrayList of integers to store numbers
	 ArrayList<Integer> numbers = new ArrayList<>();

     // Add elements to the ArrayList
	 numbers.add(10);
	 numbers.add(20);
	 numbers.add(30);
	 numbers.add(40);
	 numbers.add(50);
     
     System.out.println("ArrayList Elements:");
     // Access and print elements in the ArrayList using for-each loop
     for (Integer number : numbers) {
    	 System.out.println(number);
     }
    

     // Update an element at index 2 (third element) to 35
     numbers.set(2, 35);
   
     // Remove an element at index 1 (second element, which is 20)
     numbers.remove(1);

     // Print the size of the ArrayList
     System.out.println("Size of ArrayList: " + numbers.size());
     System.out.println("ArrayList Elements: "+numbers);
 }
}


