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

/**
 * Abstract base class for all prism shapes.
 * Extends {@link Shape} and adds a side field shared by all prism subclasses.
 * Implements {@link #calcVolume()} since all prisms share the formula: V = baseArea * height.
 * Subclasses must define their own {@link #calcBaseArea()} method.
 */
public abstract class Prism extends Shape {
	double side;
	
	/**
     * Constructs a Prism with the given height and side length.
     * Delegates height to {@link Shape} and stores the side length locally.
     *
     * @param height the height of the prism
     * @param side   the side length of the prism's base
     */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}
	
	/**
     * Calculates and returns the volume of the prism.
     * Uses the formula: V = baseArea * height, where baseArea is
     * provided by the subclass implementation of {@link #calcBaseArea()}.
     *
     * @return the volume of the prism
     */
	public double calcVolume() {
		return calcBaseArea() * height;
	}

	/**
     * Returns the side length of the prism's base.
     *
     * @return the side length
     */
	public double getSide() {
		return side;
	}

	/**
     * Sets the side length of the prism's base.
     *
     * @param side the new side length to assign
     */
	public void setSide(double side) {
		this.side = side;
	}
}