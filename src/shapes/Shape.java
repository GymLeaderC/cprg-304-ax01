/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/* Abstract base class for all three-dimensional geometric shapes.
 * Implements Comparable to provide natural ordering by height.
 * Subclasses must define their own calcVolume() and calcBaseArea() methods. */ 

public abstract class Shape implements Comparable<Shape> {
	double height;
	
	/* Constructs a Shape with the specified height. */
	
	public Shape( double height ) {
		super();
		this.height = height;
	}
	
	/* Calculates and returns the volume of the shape. */
	
	abstract public double calcVolume();
	
	/* Calculates and returns the base area of the shape. */
	
	abstract public double calcBaseArea();
	
	/*
	 * Compares this shape with another shape by height.
	 * @param s the shape to compare against
	 * @return positive if this shape is taller, negative if shorter, zero if equal */
	
	public int compareTo( Shape s ) {
		if (this.getHeight() > s.getHeight()) return 1;
		else if (this.getHeight() < s.getHeight()) return -1;
		else return 0;
	}
	
	/* Getters & Setters */
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
