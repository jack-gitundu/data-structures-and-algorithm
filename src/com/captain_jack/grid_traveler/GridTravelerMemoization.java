package com.captain_jack.grid_traveler;

import java.util.HashMap;
import java.util.Map;

/**
 * Say that you are a traveler on a 2D grid. You begin in the top-left corner and your goal is to
 * travel to the bottom-right corner. You may only move down or right.
 * How many ways can you travel to the goal on a grid with dimensions m * n
 */
public class GridTravelerMemoization {

    public static long countWays(int m, int n) {
        // Create a memoization map to store computed results
        Map<String, Long> memo = new HashMap<>();
        return countWaysMemo(m, n, memo);
    }

    private static long countWaysMemo(int m, int n, Map<String, Long> memo) {
        // Base cases
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        // Check if the result for the current dimensions is already computed
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Calculate the number of ways by moving down or right recursively
        long ways = countWaysMemo(m - 1, n, memo) + countWaysMemo(m, n - 1, memo);

        // Store the computed result in the memoization map
        memo.put(key, ways);

        return ways;
    }

    public static void main(String[] args) {
        int m = 2; // Number of rows
        int n = 3; // Number of columns
        System.out.println("Number of ways: " + countWays(m, n));
    }
}
