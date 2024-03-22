package com.captain_jack.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function fib(n) that takes in a number as an argument.
 * The function should return the n-th number of Fibonacci sequence
 */
public class Fibonacci {

    static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Long n = 50L;
        System.out.println("\n===================>");
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
        System.out.println("===================>");

    }

    public static Long fib(Long n) {
        if (n <= 1) return 1L;

        // Check if result for 'n' is already computed and stored in the memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // If not, compute and store the result in the memo
        Long fibResult = fib(n - 1) + fib(n - 2);
        memo.put(n, fibResult);
        return fibResult;
    }
}
