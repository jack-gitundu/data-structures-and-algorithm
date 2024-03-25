package com.captain_jack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a function 'howSum(targetSum, numbers) that takes in a targetSum and an array of numbers as arguments.
 * The function should return an array containing any combination of elements that add up to exactly the targetSum.
 * If there is no combination that adds up to the targetSum, then return null.
 * If there are multiple combinations possible, you may return any single one.
 */
public class HowSum {

    public static void main(String[] args) {
        int targetSum = 7;
        int[] numbers = {5, 3, 4, 7};

        System.out.println("Target Sum: " + targetSum);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        List<Integer> result = sumValues(targetSum, numbers);
        if (result != null) {
            System.out.println("Values: " + result); // Should print [4, 3]
        } else {
            System.out.println("No combination found.");
        }
    }

    public static List<Integer> sumValues(int targetSum, int[] numbers) {
        Map<Integer, List<Integer>> memo = new HashMap<>();
        return sumValuesHelper(targetSum, numbers, memo);
    }

    private static List<Integer> sumValuesHelper(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }

        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> result = sumValuesHelper(remainder, numbers, memo);
            if (result != null) {
                List<Integer> newList = new ArrayList<>(result);
                newList.add(num);
                memo.put(targetSum, newList);
                return newList;
            }
        }

        memo.put(targetSum, null);
        return null;
    }
}
