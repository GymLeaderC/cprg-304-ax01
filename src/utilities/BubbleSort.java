/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

public class BubbleSort implements SortAlgorithm {
	
	@Override
	public <T extends Comparable<T>> void sort(T[] array) {
		
		/* Outer Loop controls how many passes we make over the array.
		 * Each Pass checks one fewer element. */
	
		for (int i = 0; i <= array.length - 1; i++) {
			
			/* Inner loop compares each adjacent pair of elements.
			 * Range shrinks each pass since the smallest values
			 * have already settled at the end of the array. */
			
			for (int j = 0; j < array.length - 1 - i; j++) {
				
				/* If the current element is smaller than the next,
				 * they are in the wrong order for descending sort.
				 * Swap them using a temporary variable. */
				
				if (array[j].compareTo(array[j + 1]) < 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
