/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

public class InsertionSort implements SortAlgorithm {

	@Override
	public <T extends Comparable<T>> void sort(T[] array) {
		
		/* Outer loop keeps track of current element being sorted. */
		
		for (int i = 1; i < array.length; i++) {
			T value = array[i];
			
			/* Inner loop compares current element to the previous element. */
			
			for (int j = i - 1; j >= 0; j--) {
				
				/* If the current element is greater than the previous element,
				 * swap the elements. If not, the current element is in the
				 * correct position and the inner loop breaks to move on to
				 * the next element in the array. */
				
				if (value.compareTo(array[j]) > 0) {
					array[j + 1] = array[j];
					array[j] = value;
				} else {
					break;
				}
			}
		}
	}

	@Override
	public <T> void sort(T[] array, Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		
	}

}
