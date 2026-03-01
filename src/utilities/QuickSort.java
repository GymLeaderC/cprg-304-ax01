/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

public class QuickSort implements SortAlgorithm{

	@Override
	public <T extends Comparable<? super T>> void sort(T[] array) {
		if (array == null || array.length < 2) return;
        	QuickSort(array, 0, array.length - 1);
		
	}
	private <T extends Comparable <? super T>> int Partition(T[] array, int low, int high) {
		T pivot = array[high];
		
		int i = low-1;
		for (int j = low; j <= high - 1; j++) {
            if (array[j].compareTo( pivot) <= 0) {
                i++;
                Swap(array, i, j);
            }
        }
		Swap(array, i +1, high);
		return i +1;
		
	}
	private <T extends Comparable <? super T>> void Swap(T[] array, int i, int j) {
		T temp =  array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	private <T extends Comparable <? super T>> void QuickSort(T[] array, int low, int high) {
		if (low < high) {
			int p1 = Partition(array,low ,high);
			
			QuickSort(array, low, p1 -1);
			QuickSort(array, p1 + 1, high);
		}
	}

	public <T> void sort(T[] array, Comparator<? super T> comparator) {
	    if (array == null || array.length < 2) return;
	    QuickSort(array, 0, array.length - 1, comparator);
	}

	private <T> int Partition(T[] array, int low, int high, Comparator<? super T> comp) {
	    T pivot = array[high];
	    int i = low - 1;

	    for (int j = low; j <= high - 1; j++) {
	        if (comp.compare(array[j], pivot) <= 0) {
	            i++;
	            Swap(array, i, j);
	        }
	    }

	    Swap(array, i + 1, high);
	    return i + 1;
	}

	private <T> void Swap(T[] array, int i, int j) {
	    if (i == j) return;
	    T temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}

	private <T> void QuickSort(T[] array, int low, int high, Comparator<? super T> comp) {
	    if (low < high) {
	        int p1 = Partition(array, low, high, comp);

	        QuickSort(array, low, p1 - 1, comp);
	        QuickSort(array, p1 + 1, high, comp);
	    }
	}

}
