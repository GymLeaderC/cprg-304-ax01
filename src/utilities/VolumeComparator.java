/**
 * Comparator used to compare Shape objects based on their volume.
 *
 * <p>
 * This comparator compares two Shape objects by calculating their volumes
 * using the {@code calcVolume()} method. It returns a positive value,
 * negative value, or zero depending on the comparison result.
 * </p>
 *
 * <p>
 * When used with sorting algorithms in this project, the comparison logic
 * allows shapes to be ordered based on their volume.
 * </p>
 *
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 */


package utilities;

import java.util.Comparator;

import shapes.Shape;

public class VolumeComparator implements Comparator<Shape>{
	
	/**
     * Compares two Shape objects based on their volume.
     *
     * @param o1 the first Shape object
     * @param o2 the second Shape object
     * @return a positive integer, negative integer, or zero depending on
     *         whether the first shape's volume is greater than, less than,
     *         or equal to the second shape's volume
     */

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.calcVolume(), o2.calcVolume());
	}

}
