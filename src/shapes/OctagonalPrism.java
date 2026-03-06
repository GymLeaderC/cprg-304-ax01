/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/**
 * Represents an octagonal prism shape.
 * Extends {@link Prism} and implements {@link #calcBaseArea()} using the regular octagon formula.
 */
public class OctagonalPrism extends Prism {

	/**
     * Constructs an OctagonalPrism with the given height and side length.
     * Passes both values to {@link Prism}, which retains the side length
     * and delegates height up to {@link Shape}.
     *
     * @param height the height of the octagonal prism
     * @param side   the side length of the regular octagonal base
     */
	public OctagonalPrism(double height, double side) {
		super(height, side);
	}

	/**
     * Calculates and returns the base area of a regular octagonal prism.
     * Uses the formula: A = 2(1 + √2) * s²
     *
     * @return the base area of the octagonal prism
     */
	@Override
	public double calcBaseArea() {
		return (2 * (1 + Math.sqrt(2)) * Math.pow(side, 2));
	}
}
