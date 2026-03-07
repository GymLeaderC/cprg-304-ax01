/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 *  
 *  BaseAreaComparator — compares two shapes by their calculated base area.
 *  Used when the sorting algorithm needs to order shapes largest-to-smallest by base area.
 */

package utilities;

import java.util.Comparator;
import shapes.Shape;

public class BaseAreaComparator implements Comparator<Shape> {
	
	/**
     * Compares two shapes by base area.
     *
     * @param s1 the first shape
     * @param s2 the second shape
     * @return positive if s1 has greater base area, negative if less, zero if equal
     */

	@Override
	public int compare(Shape s1, Shape s2) {
		return Double.compare(s1.calcBaseArea(), s2.calcBaseArea());
	}
}
