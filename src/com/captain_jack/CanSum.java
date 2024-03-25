package com.captain_jack;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function 'canSum(targetSum, numbers) that takes in a targetSum and an array of numbers as arguments.
 * The function should return a boolean indicating whether or not it is possible to generate the targetSum using
 * numbers from the array.
 * <p>
 * canSum(7, [5, 3, 4, 7]); // true
 */
public class CanSum {

    public static void main(String[] args) {
        int targetSum = 7;
        int numbers[] = {5, 3, 4, 7};

        System.out.println("Target Sum: " + targetSum);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Can Sum: " + canSum(targetSum, numbers));
    }

    public static boolean canSum(Integer targetSum, int[] numbers) {
        return canSumHelper(targetSum, numbers, new HashMap<>());
    }

    public static boolean canSumHelper(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {

        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int num : numbers) {
            int remainder = targetSum - num;
            if (canSumHelper(remainder, numbers, memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }
}
