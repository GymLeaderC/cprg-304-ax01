/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

/**
 * Abstract base class for all three-dimensional geometric shapes.
 * Implements {@link Comparable} to provide natural ordering by height.
 * Subclasses must define their own {@link #calcVolume()} and {@link #calcBaseArea()} methods.
 */ 
public abstract class Shape implements Comparable<Shape> {
	double height;
	
	/**
     * Constructs a Shape with the specified height.
     *
     * @param height the height of the shape
     */
	public Shape( double height ) {
		super();
		this.height = height;
	}
	
	 /**
     * Calculates and returns the volume of the shape.
     *
     * @return the volume of the shape
     */
	abstract public double calcVolume();
	
	/**
     * Calculates and returns the base area of the shape.
     *
     * @return the base area of the shape
     */
	abstract public double calcBaseArea();
	
	/**
	 * Compares this shape with another shape by height.
	 * 
	 * @param s the shape to compare against
	 * @return positive if this shape is taller, negative if shorter, zero if equal 
	 */
	public int compareTo( Shape s ) {
		if (this.getHeight() > s.getHeight()) return 1;
		else if (this.getHeight() < s.getHeight()) return -1;
		else return 0;
	}
	
	/**
     * Returns the height of the shape.
     *
     * @return the height of the shape
     */
	public double getHeight() {
		return height;
	}
	
	/**
     * Sets the height of the shape.
     *
     * @param height the new height to assign
     */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
     * Returns the fully qualified class name of this shape.
     *
     * @return the class name as a string
     */
	@Override
	public String toString() {
		return getClass().getName();
	}
	
	
}
