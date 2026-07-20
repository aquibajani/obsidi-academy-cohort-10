package com.bptn.course.day_11.ConcurrencyWhenRunningThreads;

import java.util.Arrays;
import java.util.List;

public class ListUtils {

    // This method finds the biggest integer in the list. 
    // Then increments the integer found by one unit and finally 
    // inserts the new integer incrememented into the list.
	static void insertNextId(List<Integer> list) {
        
         if (list.isEmpty()) {
            return; // Handle empty list scenario
        }

		int max = list.get(0);

		for (int element : list) {
			if (element > max) {
				max = element;
			}
		}
		
		list.add(++max);
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);
	}
}