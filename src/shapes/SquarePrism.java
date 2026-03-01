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

public class SquarePrism extends Shape {

    private double edgeLength;

    /**
     * Constructs a SquarePrism with the given height and base edge length.
     *
     * @param height     the height of the prism
     * @param edgeLength the length of one side of the square base
     */
    public SquarePrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    /**
     * Calculates the base area of the prism.
     * Formula: s²
     *
     * @return the area of the square base
     */
    @Override
    public double calcBaseArea() {
        return edgeLength * edgeLength;
    }

    /**
     * Calculates the volume of the prism.
     * Formula: s² * h
     *
     * @return the volume of the prism
     */
    @Override
    public double calcVolume() {
        return calcBaseArea() * height;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "shapes.SquarePrism";
    }
}