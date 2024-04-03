package com.captain_jack;

public class PalindromeChecker {

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";
        boolean result = isPalindrome(testString);
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Normalize the string
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        // Step 2: Two Pointers Approach
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;  // It's not a palindrome if there's a mismatch
            }
            start++;
            end--;
        }
        return true;
    }
}
