/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/**
 * Represents a pentagonal prism shape.
 * Extends {@link Prism} and implements {@link #calcBaseArea()} using the regular pentagon formula.
 */
public class PentagonalPrism extends Prism {
	
	/**
     * Constructs a PentagonalPrism with the given height and side length.
     * Passes both values to {@link Prism}, which retains the side length
     * and delegates height up to {@link Shape}.
     *
     * @param height the height of the pentagonal prism
     * @param side   the side length of the regular pentagonal base
     */
	public PentagonalPrism(double height, double side) {
		super(height, side);
	}

	/**
     * Calculates and returns the base area of a regular pentagonal prism.
     * Uses the formula: A = 5 * s² * tan(54°) / 4
     *
     * @return the base area of the pentagonal prism
     */
	@Override
	public double calcBaseArea() {
		return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54)) / 4);
	}
}
