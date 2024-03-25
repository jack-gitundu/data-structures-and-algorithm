package com.captain_jack;

import java.util.HashMap;
import java.util.Map;

/**
 * Java Program to Find the First Non-repeated Character in a String
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "hello";
        char firstNonRepeated = firstNonRepeatedChar(input);
        if (firstNonRepeated != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char firstNonRepeatedChar(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        // Return default character if no non-repeated character found
        return '\0';
    }

}
