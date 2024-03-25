package com.captain_jack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java Program to Count Number of Duplicate Words in a Given String
 */
public class DuplicateWordsInString {

    public static void main(String[] args) {

        duplicateWords("java guides java");

        duplicateWords("Java is java again java");

        duplicateWords("Super Man Bat Man Spider Man");
    }

    private static void duplicateWords(String inputString) {
        // Splitting inputString into words
        final String[] words = inputString.toLowerCase().split("\\W+");

        // Creating one HashMap with words as key and their count as value
        final Map<String, Integer> wordCount = new HashMap<>();

        // Checking each word
        for (String word : words) {
            // Incrementing the count of the word
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> word : wordCount.entrySet()) {

            if (word.getValue() > 1) {
                // Printing duplicate word and its count
                System.out.println(word.getKey() + " : " + word.getValue());
            }
        }
    }
}


