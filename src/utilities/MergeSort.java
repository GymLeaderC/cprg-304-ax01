/**
 * A generic implementation of merge sort
 * 
 * <p>
 * 	merge sort divides the array recursively into separate arrays, until it can not be more divided.
 * 	each of the sub arrays are then sorted 
 * 	the sorted sub arrays are merged back together level by level, and continues until the there is no more subarrays
 * </p>
 * 
 * Time Complexity
 * 
 * <ul>
 * 	<li>Best Case Scenario: O(n log n)</li>
 * 	<li>Average Case Scenario: O(n log n)</li>
 * 	<li>Worst Case Scenario:  </li>
 * </ul>
 * 
 * Space Complexity: O(n)
 * 
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 *  
 */

package utilities;

import java.util.Comparator;

public class MergeSort implements SortAlgorithm {
	
	/**
	 * Sorts the given array in descending order using merge sort and the natural
	 * ordering in elements
	 * 
	 * @param <T> the type of elements in the array; must implement comparable
	 * @param "array" is to be sorted
	 */

    @Override
    public <T extends Comparable<? super T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;

        mergeSort(array, 0, array.length - 1);
    }
    
    /**
     *  recursively divides the array into smaller sub arrays, sorts them,
     *  and merges them back together
     *  
     * @param <T> the type of elements in the array; must implement comparable
     * @param array the array that is being sorted
     * @param left the starting index of the sub  array
     * @param right the ending index of the sub array
     */

    private <T extends Comparable<? super T>> void mergeSort(T[] array, int left, int right) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }
    
    /**
     * Merges two sorted sub arrays into one sorted section of the original array.
     * <p>
     * The first sub array spans from {@code left} to {@code mid}, and the second
     * spans from {@code mid + 1} to {@code right}.
     * </p>
     * <p>
     * This implementation places larger values first, producing descending order.
     * </p>
     *
     * @param <T> the type of elements in the array; must implement Comparable
     * @param array the array containing the sub arrays to merge
     * @param left the starting index of the first sub array
     * @param mid the ending index of the first sub array
     * @param right the ending index of the second sub array
     */

    @SuppressWarnings("unchecked")
	private <T extends Comparable<? super T>> void merge(
            T[] array, int left, int mid, int right) {

        Object[] temp = new Object[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Merge both halves
        while (i <= mid && j <= right) {
            if (array[i].compareTo(array[j]) >= 0)
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }

        // Left leftovers
        while (i <= mid)
            temp[k++] = array[i++];

        // Right leftovers
        while (j <= right)
            temp[k++] = array[j++];

        // Copy back into original array
        for (int x = 0; x < temp.length; x++)
            array[left + x] = (T) temp[x];
    }

    /**
    * Sorts the given array using Merge Sort and the provided Comparator.
    *
    * @param <T> the type of elements in the array
    * @param array the array to be sorted
    * @param comparator the Comparator used to determine element ordering
    */

    @Override
    public <T> void sort(T[] array, Comparator<? super T> comparator) {
        if (array == null || array.length < 2) return;

        mergeSort(array, 0, array.length - 1, comparator);
    }
    
    /**
     * Recursively divides the array into smaller subarrays, sorts them using
     * the provided Comparator, and merges them back together.
     *
     * @param <T> the type of elements in the array
     * @param array the array being sorted
     * @param left the starting index of the current subarray
     * @param right the ending index of the current subarray
     * @param comparator the Comparator used to determine element ordering
     */

    private <T> void mergeSort(
            T[] array, int left, int right,
            Comparator<? super T> comparator) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid, comparator);
        mergeSort(array, mid + 1, right, comparator);

        merge(array, left, mid, right, comparator);
    }
    
    /**
     * Merges two sorted subarrays into one sorted section of the original array
     * using the provided Comparator.
     *
     * @param <T> the type of elements in the array
     * @param array the array containing the subarrays to merge
     * @param left the starting index of the first subarray
     * @param mid the ending index of the first subarray
     * @param right the ending index of the second subarray
     * @param comparator the Comparator used to determine element ordering
     */

    @SuppressWarnings("unchecked")
	private <T> void merge(
            T[] array, int left, int mid, int right,
            Comparator<? super T> comparator) {

        Object[] temp = new Object[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (comparator.compare(array[i], array[j]) >= 0)
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }

        while (i <= mid)
            temp[k++] = array[i++];

        while (j <= right)
            temp[k++] = array[j++];

        for (int x = 0; x < temp.length; x++)
            array[left + x] = (T) temp[x];
    }
}