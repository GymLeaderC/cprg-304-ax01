/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * TriangularPrism — a prism with an equilateral triangle base, defined by height and edge length.
 * Extends Shape and provides base area and volume calculations.
 */

package shapes;

public class TriangularPrism extends Prism {

    /**
     * Constructs a TriangularPrism with the given height and base edge length.
     *
     * @param height     the height of the prism
     */
    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    /**
     * Calculates the base area of the prism.
     * Formula: (s * s * Math.sqrt(3)) / 4
     *
     * @return the area of the equilateral triangle base
     */
    @Override
    public double calcBaseArea() {
    	double s = getSide();
        return (s * s * Math.sqrt(3)) / 4;
    }
}