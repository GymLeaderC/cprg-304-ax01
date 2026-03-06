/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 *  
 * Cone — A shape with a round base and pointed top.
 * Extends Shape, which includes height methods
 */

package shapes;

public class Cone extends Shape {

	double radius;

	/**
     * Passes height to Shape.
     *
     * @param height - The height of the cone
     * @param radius - The radius of the circular base of the cone
     */
	
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	/**
     * Calculates the volume of the cone.
     * Formula: (1/3) * pi * r² * h
     *
     * @return the volume of the cone
     */

	@Override
	public double calcVolume() {
		return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	/**
     * Calculates the base area of the cone.
     * Formula: pi * r²
     *
     * @return the area of the circular base
     */
	
	@Override
	public double calcBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
