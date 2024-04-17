package com.captain_jack;

import java.util.Scanner;

/**
 * Given two numbers, calculate the Greatest Common Divisor(GCD) or the Highest Common Factor(HCF
 * <p>
 * Euclid's algorithm
 * 1. Find the largest number.
 * 2. Replace the larger number by the difference between the larger and the smaller number.
 * 3. Repeat step 1 & 2 until both numbers become equal.
 * 4. Return any one number, which is the GCd.
 */
public class Gcd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = scan.nextInt();

        System.out.print("Enter the second value: ");
        int b = scan.nextInt();

        int gcd = euclidGcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    static int euclidGcd(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
