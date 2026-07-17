package com.bptn.course.day_10;

import java.util.HashSet;
import java.util.Set;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		// Print the size of the set
		System.out.println("Size of the set: " + set.size());

		// Use for loop to print the values in the set
		for (String value : set) {
			System.out.println(value);
		}

		// Use add() method to add a new value to the set
		System.out.println("Adding value F to the set.");
		set.add("F");
		
		// Update the value of "B" to "B2" by removing "B" and adding "B2"
		System.out.println("Updating value B to B2.");
		set.remove("B");
		set.add("B2");
		
		// Use remove() method to remove a value from the set
		System.out.println("Removing value D from the set.");
		set.remove("D");
		
		// Use contains() method to check if the value "C" exists in the set
		if (set.contains("C")) {
			System.out.println("Value C exists in the set.");
		} else {
			System.out.println("Value C does not exist in the set.");
		}
		
	}
}