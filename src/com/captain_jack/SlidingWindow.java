package com.captain_jack;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] nums = {2, 9, 31, -4, 21, 7};
        int k = 3;
        int maxSum = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of subarray of length " + k + ": " + maxSum);
    }

    static int maxSumSubarray(int[] array, int k) {

        int windowSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        for (int i = k; i < array.length; i++) {
            windowSum = windowSum - array[i - k] + array[i];
            maximumSum = Math.max(maximumSum, windowSum);
        }
        return maximumSum;
    }
}