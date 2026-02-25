/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/* Abstract base class for all prism shapes.
 * Extends Shape and adds a side field shared by all prism types.
 * Implements calcVolume() since all prisms use baseArea * height.
 * Subclasses must define their own calcBaseArea() method. */

public abstract class Prism extends Shape {
	double side;
	
	/* Constructor passes height up to Shape and stores side in Prism */
	
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}
	
	/* Calculates and returns the volume of the shape. */
	
	public double calcVolume() {
		return calcBaseArea() * height;
	}

	/* Getters & Setters */

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
