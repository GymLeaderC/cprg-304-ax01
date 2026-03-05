/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * ShellSort — a spacing-based extension of insertion sort. Instead of always
 * comparing neighbours, it starts by comparing elements far apart, then
 * shrinks that spacing each pass until it reaches 1. By the time the final
 * pass runs, the array is nearly sorted and that last sweep is very cheap.
 */

package utilities;

import java.util.Comparator;

public class ShellSort implements SortAlgorithm {

    /**
     * Sorts by height using Comparable (the shape's natural ordering).
     * Uses Knuth's sequence: 1, 4, 13, 40... built as space = space * 3 + 1.
     *
     * @param shapes the array of shapes to sort in descending order
     */
    @Override
    public <T extends Comparable<? super T>> void sort(T[] shapes) {
        int size = shapes.length;

        // build up to the largest useful spacing using Knuth's sequence
        int space = 1;
        while (space < size / 3) {
            space = space * 3 + 1;
        }

        // run a pass at each spacing, shrinking down to 1
        while (space >= 1) {

            // pick up each shape and find where it belongs at this spacing
            for (int pickup = space; pickup < size; pickup++) {
                T held = shapes[pickup];

                // shift larger shapes right to clear a path for `held`
                int clearance = pickup;
                while (clearance >= space && shapes[clearance - space].compareTo(held) < 0) {
                    shapes[clearance] = shapes[clearance - space];
                    clearance -= space;
                }

                // place `held` in the space it cleared
                shapes[clearance] = held;
            }

            // next smaller spacing in the Knuth sequence
            space = space / 3;
        }
    }

    /**
     * Sorts by volume or base area using a Comparator.
     * Same spacing logic — the Comparator decides what "larger" means.
     *
     * @param shapes     the array of shapes to sort in descending order
     * @param comparator the comparison rule to apply (volume or base area)
     */
    @Override
    public <T> void sort(T[] shapes, Comparator<? super T> comparator) {
        int size = shapes.length;

        // build up to the largest useful spacing using Knuth's sequence
        int space = 1;
        while (space < size / 3) {
            space = space * 3 + 1;
        }

        while (space >= 1) {

            for (int pickup = space; pickup < size; pickup++) {
                T held = shapes[pickup];

                // shift larger shapes right to clear a path for `held`
                int clearance = pickup;
                while (clearance >= space && comparator.compare(shapes[clearance - space], held) < 0) {
                    shapes[clearance] = shapes[clearance - space];
                    clearance -= space;
                }

                shapes[clearance] = held;
            }

            space = space / 3;
        }
    }
}