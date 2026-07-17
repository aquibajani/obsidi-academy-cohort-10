package com.bptn.course.day_10;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test is a test is a test is a test is a test sentence with no repeating words";

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Split the sentence into words using split() method
        // Iterate through each word in the sentence
        for (String word : sentence.split(" ")) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {
				wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
               wordFrequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}

