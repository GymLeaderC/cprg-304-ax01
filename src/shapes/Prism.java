/**
 * @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 * Southern Alberta Institute of Technology: CPRG-304-B
 * Assignment 1: Complexity & Sorting
 * Created: 02.18.2026
 *
 * Prism — abstract base for all prism shapes. Holds the shared side field
 * and handles volume calculation, since every prism is just baseArea * height.
 * Subclasses only need to define their own calcBaseArea().
 */

package shapes;

/* Abstract base class for all prism shapes.
 * Extends Shape and adds a side field shared by all prism types.
 * Implements calcVolume() since all prisms use baseArea * height.
 * Subclasses must define their own calcBaseArea() method. */

public abstract class Prism extends Shape {
	double side;

	/**
	 * Passes height up to Shape and stores the side length here in Prism.
	 *
	 * @param height the height of the prism
	 * @param side   the edge length of the base polygon
	 */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}

	/**
	 * Calculates volume using the universal prism formula — base area times height.
	 * Delegates to calcBaseArea() so each subclass provides its own base shape math.
	 *
	 * @return the volume of the prism
	 */
	public double calcVolume() {
		return calcBaseArea() * height;
	}

	/**
	 * Returns the edge length of the base polygon.
	 *
	 * @return side length
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Updates the edge length of the base polygon.
	 *
	 * @param side the new side length
	 */
	public void setSide(double side) {
		this.side = side;
	}
}