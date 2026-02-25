/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

/* Interface for sorting algorithms using the Strategy Design Pattern.
 * Each implementing class provides its own sorting algorithm while
 * following the same contract, allowing algorithms to be swapped at runtime. */

public interface SortAlgorithm {
	
	/* Sorts an array in descending order using the natural ordering
     * defined by the elements' compareTo method (Comparable). */
	
	<T extends Comparable<T>> void sort(T[] array);
	
	/* Sorts an array in descending order using a provided Comparator
    * to define the comparison strategy. */
	
	<T> void sort(T[] array, Comparator<? super T> comparator);
}
