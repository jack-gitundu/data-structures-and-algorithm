package com.captain_jack.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciRecursiveProgram {

    public static BigInteger fibonacci(int n) {

        if (n <= 1) return BigInteger.valueOf(n);
        return fibonacci(n - 2).add(fibonacci(n - 1));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger value = fibonacci(i);
            System.out.print(value + "\t");
        }
        scanner.close();
    }
}
