package com.captain_jack.searching_algorithms; /**
 * Binary search is a fast search algorithm with run-time complexity of Ο(log n).
 * This search algorithm works on the principle of divide and conquer.
 * For this algorithm to work properly, the data collection should be in the sorted form.
 */

/**
 * @author Jackson G. Mwaniki
 */
public class BinarySearchIteratively {

    public static void main(String[] args) {
        int[] sortedArray = {0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9}; // Sorted array
        int key = 6; // Value to find

        BinarySearchIteratively binSearch = new BinarySearchIteratively();
        int index = binSearch.binarySearchIteratively(sortedArray, key);

        System.out.println("====================================>");
        System.out.println("Search element: " + key + " found in location index: " + index);
        System.out.println("====================================>");

    }

    public int binarySearchIteratively(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;
        int index = Integer.MAX_VALUE;

        while (low <= high) { // Continue looping as long as low value is less than or equal to high value

            int mid = (low + high) / 2; // Calculates the middle index (mid) of the current search range.

            if (sortedArray[mid] < key) { // If mid value is less than key, discards the lower half of the array (low = mid + 1).
                low = mid + 1;
            } else if (sortedArray[mid] > key) { // If mid value is greater than key, discards the upper half (high = mid - 1).
                high = mid - 1;
            } else if (sortedArray[mid] == key) { // If the mid value is equal to key, then the key is found, sets index to mid and breaks the loop.
                index = mid;
                break;
            }
        }
        return index;
    }
}