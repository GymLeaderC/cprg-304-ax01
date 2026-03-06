/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * SelectionSort — scans the unsorted portion of the array to find the
 * largest remaining element, then drops it into its correct position.
 * Repeats until the whole array is sorted in descending order.
 */

package utilities;

import java.util.Comparator;

public class SelectionSort implements SortAlgorithm {

    /**
     * Sorts by volume or base area using a Comparator.
     * The Comparator tells us HOW to compare — we just drive the logic.
     *
     * @param shapes     the array to sort (descending)
     * @param comparator the comparison rule to use (volume or base area)
     */
    @Override
    public <T> void sort(T[] shapes, Comparator<? super T> comparator) {
        int size = shapes.length;

        for (int sorted = 0; sorted < size - 1; sorted++) {
            int currentLargest = sorted;

            // scan everything we haven't placed yet
            for (int scout = sorted + 1; scout < size; scout++) {
                if (comparator.compare(shapes[scout], shapes[currentLargest]) > 0) {
                    currentLargest = scout;
                }
            }

            // if we found something bigger than what's at `sorted`, swap them
            if (currentLargest != sorted) {
                swap(shapes, sorted, currentLargest);
            }
        }
    }

    /**
     * Sorts by height using Comparable (the shape's natural ordering).
     * No Comparator needed — the shape knows how to compare itself.
     *
     * @param shapes the array to sort (descending)
     */
    @Override
    public <T extends Comparable<? super T>> void sort(T[] shapes) {
        int size = shapes.length;

        for (int sorted = 0; sorted < size - 1; sorted++) {
            int currentLargest = sorted;

            // scout forward to find the biggest remaining shape
            for (int scout = sorted + 1; scout < size; scout++) {
                if (shapes[scout].compareTo(shapes[currentLargest]) > 0) {
                    currentLargest = scout;
                }
            }

            // if we found something bigger than what's at `sorted`, swap them
            if (currentLargest != sorted) {
                swap(shapes, sorted, currentLargest);
            }
        }
    }

    /**
     * Swaps two elements in the array.
     *
     * @param shapes the array containing the elements to swap
     * @param a      index of the first element
     * @param b      index of the second element
     */
    private static <T> void swap(T[] shapes, int a, int b) {
        T temp = shapes[a];
        shapes[a] = shapes[b];
        shapes[b] = temp;
    }
}