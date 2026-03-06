/**
 * A generic implementation of quick sort
 * 
 * <p>
 * 	Quick Sort is a divide-and-conquer sorting algorithm. It works by selecting
 * 	a pivot element from the array and partitioning the remaining elements into
 * 	two groups: those greater than the pivot and those smaller than the pivot.
 * 	The process is then applied recursively to the sub arrays on either side of
 * 	the pivot until the entire array is sorted.
 * </p>
 * 
 * Time Complexity
 * 
 * <ul>
 * 	<li>Best Case Scenario: O(n log n)</li>
 *     <li>Average Case Scenario: O(n log n)</li>
 *     <li>Worst Case Scenario: O(n²)</li>
 * </ul>
 * 
 * Space Complexity: O(log n)
 * 
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 *  
 */

package utilities;

import java.util.Comparator;

public class QuickSort implements SortAlgorithm{
	
	/**
     * Sorts an array using Quick Sort with the natural ordering
     * defined by Comparable.
     *
     * @param <T> the type of elements being sorted
     * @param array the array to be sorted
     */

	@Override
	public <T extends Comparable<? super T>> void sort(T[] array) {
		if (array == null || array.length < 2) return;
        	quickSort(array, 0, array.length - 1);
		
	}
	
	/**
     * Partitions the array around a pivot element.
     * Elements greater than the pivot are moved to the left
     * and smaller elements are moved to the right.
     *
     * @param <T> the type of elements being sorted
     * @param array the array being partitioned
     * @param low the starting index
     * @param high the ending index
     * @return the final position of the pivot element
     */
	
	private <T extends Comparable <? super T>> int Partition(T[] array, int low, int high) {
		T pivot = array[high];
		
		int i = low-1;
		for (int j = low; j <= high - 1; j++) {
            if (array[j].compareTo( pivot) >= 0) {
                i++;
                Swap(array, i, j);
            }
        }
		Swap(array, i +1, high);
		return i +1;
		
	}
	
	/**
     * Swaps two elements within the array.
     *
     * @param <T> the type of elements in the array
     * @param array the array containing the elements
     * @param i the index of the first element
     * @param j the index of the second element
     */
	
	private <T extends Comparable <? super T>> void Swap(T[] array, int i, int j) {
		T temp =  array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	/**
     * Recursively applies Quick Sort to partitions of the array.
     *
     * @param <T> the type of elements being sorted
     * @param array the array being sorted
     * @param low the starting index
     * @param high the ending index
     */
	
	private <T extends Comparable <? super T>> void quickSort(T[] array, int low, int high) {
		if (low < high) {
			int p1 = Partition(array,low ,high);
			
			quickSort(array, low, p1 -1);
			quickSort(array, p1 + 1, high);
		}
	}
	/**
     * Sorts an array using Quick Sort and a provided Comparator.
     *
     * @param <T> the type of elements being sorted
     * @param array the array to be sorted
     * @param comparator the comparator used to determine ordering
     */
	public <T> void sort(T[] array, Comparator<? super T> comparator) {
	    if (array == null || array.length < 2) return;
	    quickSort(array, 0, array.length - 1, comparator);
	}
	/**
     * Partitions the array using a Comparator to determine ordering.
     *
     * @param <T> the type of elements being sorted
     * @param array the array being partitioned
     * @param low the starting index
     * @param high the ending index
     * @param comp the comparator used for comparison
     * @return the final pivot position
     */
	private <T> int Partition(T[] array, int low, int high, Comparator<? super T> comp) {
	    T pivot = array[high];
	    int i = low - 1;

	    for (int j = low; j <= high - 1; j++) {
	        if (comp.compare(array[j], pivot) >= 0) {
	            i++;
	            swap(array, i, j);
	        }
	    }

	    swap(array, i + 1, high);
	    return i + 1;
	}

	/**
     * Swaps two elements using the comparator version.
     *
     * @param <T> the type of elements in the array
     * @param array the array containing the elements
     * @param i index of first element
     * @param j index of second element
     */
	
	private <T> void swap(T[] array, int i, int j) {
	    if (i == j) return;
	    T temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	/**
     * Recursive Quick Sort using a Comparator.
     *
     * @param <T> the type of elements being sorted
     * @param array the array being sorted
     * @param low the starting index
     * @param high the ending index
     * @param comp the comparator used for ordering
     */
	private <T> void quickSort(T[] array, int low, int high, Comparator<? super T> comp) {
	    if (low < high) {
	        int p1 = Partition(array, low, high, comp);

	        quickSort(array, low, p1 - 1, comp);
	        quickSort(array, p1 + 1, high, comp);
	    }
	}

}
