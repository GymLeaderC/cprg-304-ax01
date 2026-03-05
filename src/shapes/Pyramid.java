/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * Pyramid — a square-based pyramid defined by height and edge length.
 * Extends Shape and provides base area and volume calculations.
 */

package shapes;

public class Pyramid extends Shape {

    private double edgeLength;

    /**
     * Constructs a Pyramid with the given height and base edge length.
     *
     * @param height     the height of the pyramid
     * @param edgeLength the length of one side of the square base
     */
    public Pyramid(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    /**
     * Calculates the base area of the pyramid.
     * Formula: s²
     *
     * @return the area of the square base
     */
    @Override
    public double calcBaseArea() {
        return edgeLength * edgeLength;
    }

    /**
     * Calculates the volume of the pyramid.
     * Formula: (1/3) * s² * h
     *
     * @return the volume of the pyramid
     */
    @Override
    public double calcVolume() {
        return (1.0 / 3.0) * calcBaseArea() * height;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
}