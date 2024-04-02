package com.captain_jack.searching_algorithms;

/**
 * Find max value in an increasing and decreasing array
 * <p>
 * Step Approach====>
 * array[] = {6, 9, 15, 25, 35, 50, 41, 29, 23, 8}
 * <p>
 * Left is less & right is more: y < x and x < z
 * Left is more & right is less: y > x > z
 * Left is less & right is less: y < x > z
 */
public class MaxValue {

    public static void main(String[] args) {
        int[] array = {3, 5, 15, 50, 11, 10, 8, 6};
        int n = array.length;
        System.out.println("The maximum Value " + findMaximumValue(array, 0, n - 1));
    }

    private static int findMaximumValue(int[] array, int start, int end) {

        if (start == end) return array[start];

        if (end == start + 1) {
            if (array[start] >= array[end]) {
                return array[start];
            } else {
                return array[end];
            }
        }

        int mid = (start + end) / 2;
        if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
            return array[mid];
        }

        if (array[mid] > array[mid + 1] && array[mid] < array[mid - 1]) {
            return findMaximumValue(array, start, mid - 1);
        } else {
            return findMaximumValue(array, mid + 1, end);
        }

    }


}
