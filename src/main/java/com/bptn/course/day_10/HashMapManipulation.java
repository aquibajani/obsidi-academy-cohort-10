package com.bptn.course.day_10;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);

		// Print the size of the map
		System.out.println("Size of the map: " + map.size());

		// Use a for-each loop to print the key-value pairs in the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Use get() method to get the value of key "A"
		System.out.println("Value of key A: " + map.get("A"));


        // use put() method to add a new key-value pair to the map
		System.out.println("Adding key F with value 6 to the map.");
		map.put("F", 6);
		
		// update the value of key "B" to 20
		System.out.println("Updating value of key B to 20.");
		map.put("B", 20);
		

		// Use the containsKey() method to check if the key "C" exists in the map
		if (map.containsKey("G")) {
			System.out.println("Key C exists in the map.");
		} else {
			System.out.println("Key C does not exist in the map.");
		}
		
		// delete the key-value pair with key "D" from the map
		System.out.println("Removing key D from the map.");
		map.remove("D");
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}
