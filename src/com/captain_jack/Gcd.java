package com.captain_jack;

import java.util.Scanner;

/**
 * Given two numbers, calculate the Greatest Common Divisor(GCD) or the Highest Common Factor(HCF
 */
public class Gcd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(euclidGcd(a, b));
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
