/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * SquarePrism — a prism with a square base, defined by height and edge length.
 * Extends Prism, so volume is handled — only base area needs to be defined here.
 */

package shapes;

public class SquarePrism extends Prism {

    /**
     * Passes both values up to Prism, which stores side and passes height to Shape.
     *
     * @param height the height of the prism
     * @param side   the edge length of the square base
     */
    public SquarePrism(double height, double side) {
        super(height, side);
    }

    /**
     * Calculates the base area of the square face.
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