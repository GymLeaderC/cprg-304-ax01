/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

public class MergeSort implements SortAlgorithm{

	@Override
	public <T extends Comparable<T>> void sort(T[] array) {
		if (array == null || array.length <2) 
			return;
		
		
	}

	@Override
	public <T> void sort(T[] array, Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		
	}

}