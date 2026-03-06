/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

/**
 * Implements the Bubble Sort algorithm using the {@link SortAlgorithm} interface.
 * Sorts arrays in descending order by repeatedly comparing and swapping adjacent elements.
 */
public class BubbleSort implements SortAlgorithm {
	
	/**
     * Sorts an array in descending order using the natural ordering
     * defined by each element's {@link Comparable#compareTo(Object)} method.
     *
     * @param <T>   the type of elements in the array, must implement {@link Comparable}
     * @param array the array to be sorted
     */
	@Override
	public <T extends Comparable<? super T>> void sort(T[] array) {
		
		// Outer loop controls how many passes we make over the array.
        // Each pass checks one fewer element.
		for (int i = 0; i <= array.length - 1; i++) {
			
			// Inner loop compares each adjacent pair of elements.
            // Range shrinks each pass since the smallest values
            // have already settled at the end of the array.
			for (int j = 0; j < array.length - 1 - i; j++) {
				
				// If the current element is smaller than the next,
                // they are in the wrong order for descending sort.
                // Swap them using a temporary variable.
				if (array[j].compareTo(array[j + 1]) < 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
     * Sorts an array in descending order using a provided {@link Comparator}
     * to define the comparison strategy.
     *
     * @param <T>        the type of elements in the array
     * @param array      the array to be sorted
     * @param comparator the comparator used to determine element ordering
     */
	@Override
	public <T> void sort(T[] array, Comparator<? super T> comparator) {
		
		// Outer loop controls how many passes we make over the array.
        // Each pass checks one fewer element.
		for (int i = 0; i <= array.length - 1; i++) {
			
			// Inner loop compares each adjacent pair of elements.
            // Range shrinks each pass since the smallest values
            // have already settled at the end of the array.
			for (int j = 0; j < array.length - 1 - i; j++) {
				
				// If the current element is smaller than the next,
                // they are in the wrong order for descending sort.
                // Swap them using a temporary variable.
				 if (comparator.compare(array[j], array[j + 1]) < 0) {
					 T temp = array[j];
					 array[j] = array[j + 1];
					 array[j + 1] = temp;
				 }
			}
		}
	}
}
