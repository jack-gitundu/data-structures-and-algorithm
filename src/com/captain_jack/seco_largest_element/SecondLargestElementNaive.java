package com.captain_jack.seco_largest_element;

import java.util.Arrays;

/**
 * @author Jackson G. Mwaniki
 */

/**
 * Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
 * <p>
 * Note: If the second largest element does not exist, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * <p>
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * <p>
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second largest element.
 */
public class SecondLargestElementNaive {

    static int secondLargest(int[] nums) {
        int n = nums.length;
        // Sort the array in non-decreasing order
        Arrays.sort(nums);
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i - 1]) {
                return nums[i];
            }
        }
        // If no second largest element was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }


}
