/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/* Represents a octagonal prism shape.
 * Extends Prism and implements calcBaseArea() using the regular octagon formula */

public class OctagonalPrism extends Prism {

	/* OctagonalPrism hands both values to Prism
	 * Prism keeps side and passes height up to Shape */
	
	public OctagonalPrism(double height, double side) {
		super(height, side);
	}

	/* Calculates and returns the base area of a Octagonal Prism */
	
	@Override
	public double calcBaseArea() {
		return (2 * (1 + Math.sqrt(2)) * Math.pow(side, 2));
	}
}
