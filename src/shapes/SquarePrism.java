/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * SquarePrism — a prism with a square base, defined by height and edge length.
 * Extends Shape and provides base area and volume calculations.
 */

package shapes;

public class SquarePrism  extends Prism{

    /**
     * Constructs a SquarePrism with the given height and base edge length.
     *
     * @param height     the height of the prism
     */
    public SquarePrism(double height, double side) {
        super(height, side);
    }

    /**
     * Calculates the base area of the prism.
     * Formula: s²
     *
     * @return the area of the square base
     */
    @Override
    public double calcBaseArea() {
    	double s = getSide();
        return s * s;
    }
}