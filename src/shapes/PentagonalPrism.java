/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/* Represents a pentagonal prism shape.
 * Extends Prism and implements calcBaseArea() using the regular pentagon formula */

public class PentagonalPrism extends Prism {
	
	/* PentagonalPrism hands both values to Prism
	 * Prism keeps side and passes height up to Shape */

	public PentagonalPrism(double height, double side) {
		super(height, side);
	}

	/* Calculates and returns the base area of a Pentagonal Prism */
	
	@Override
	public double calcBaseArea() {
		return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54)) / 4);
	}
}
