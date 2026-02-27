/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;

public class MergeSort implements SortAlgorithm {

   

    @Override
    public <T extends Comparable<? super T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;

        mergeSort(array, 0, array.length - 1);
    }

    private <T extends Comparable<? super T>> void mergeSort(T[] array, int left, int right) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }

    private <T extends Comparable<? super T>> void merge(
            T[] array, int left, int mid, int right) {

        Object[] temp = new Object[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Merge both halves
        while (i <= mid && j <= right) {
            if (array[i].compareTo(array[j]) <= 0)
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

    

    @Override
    public <T> void sort(T[] array, Comparator<? super T> comparator) {
        if (array == null || array.length < 2) return;

        mergeSort(array, 0, array.length - 1, comparator);
    }

    private <T> void mergeSort(
            T[] array, int left, int right,
            Comparator<? super T> comparator) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid, comparator);
        mergeSort(array, mid + 1, right, comparator);

        merge(array, left, mid, right, comparator);
    }

    private <T> void merge(
            T[] array, int left, int mid, int right,
            Comparator<? super T> comparator) {

        Object[] temp = new Object[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (comparator.compare(array[i], array[j]) <= 0)
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