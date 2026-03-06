/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * VolumeComparator — compares two shapes by their calculated volume.
 * Used when the sorting algorithm needs to order shapes largest-to-smallest by volume.
 */

package utilities;

import java.util.Comparator;
import shapes.Shape;

public class VolumeComparator implements Comparator<Shape> {

    /**
     * Compares two shapes by volume.
     *
     * @param s1 the first shape
     * @param s2 the second shape
     * @return positive if s1 has greater volume, negative if less, zero if equal
     */
    @Override
    public int compare(Shape s1, Shape s2) {
        return Double.compare(s1.calcVolume(), s2.calcVolume());
    }
}