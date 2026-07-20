package com.bptn.course.day_10.Streams;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
     // List<String> fruits = Arrays.asList("Apple", "Aanana", "Arange", "Aango", "Grapes");
    	List<String> fruits = new ArrayList<String>();
    	fruits.add("Apple");
    	fruits.add("Anana");
    	fruits.add("Arange");
    	fruits.add("Aango");
    	fruits.add("Grapes");
    	
    	List<Integer> numbers = new ArrayList<Integer>();
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(1);
    	numbers.add(2);
    	numbers.add(3);
    	numbers.add(4);
    	
    	System.out.println("Original numbers: " + numbers);
    	
    	System.out.println(numbers.stream()
    			.distinct());
    	
    	
    //	System.out.println("Original fruits: " + fruits.stream());
    	
        // Filtering fruits starting with "A"
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .map(fruit -> fruit.toUpperCase())
				.toList();
        // filteredFruits.forEach(fruit -> System.out.println(fruit));
        filteredFruits.forEach(System.out::println);

        System.out.println("Filtered fruits: " + filteredFruits);
        
        
    }
    
    
    
    

}
