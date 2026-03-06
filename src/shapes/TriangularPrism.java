/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * TriangularPrism — a prism with an equilateral triangle base, defined by height and edge length.
 * Extends Prism, so volume is handled — only base area needs to be defined here.
 */

package shapes;

public class TriangularPrism extends Prism {

    /**
     * Passes both values up to Prism, which stores side and passes height to Shape.
     *
     * @param height the height of the prism
     * @param side   the edge length of the equilateral triangle base
     */
    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    /**
     * Calculates the base area of the equilateral triangle face.
     * Formula: (s² * √3) / 4
     *
     * @return the area of the equilateral triangle base
     */
    @Override
    public double calcBaseArea() {
        double s = getSide();
        return (s * s * Math.sqrt(3)) / 4;
    }
}