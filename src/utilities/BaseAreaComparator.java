/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package utilities;

import java.util.Comparator;
import shapes.Shape;

public class BaseAreaComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape s1, Shape s2) {
		return Double.compare(s1.calcBaseArea(), s2.calcBaseArea());
	}
}
