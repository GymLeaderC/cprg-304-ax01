/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 *  
 *  Cylinder — A shape with a round base that extends perpendicularly.
 *  Extends Shape, which includes height methods
 */

package shapes;

public class Cylinder extends Shape {
	double radius;
	
	/**
     * Passes height to Shape.
     *
     * @param height - The height of the cylinder
     * @param radius - The radius of the circular base of the cylinder
     */

	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	/**
     * Calculates the volume of the cylinder.
     * Formula: pi * r² * h
     *
     * @return the volume of the cylinder
     */

	@Override
	public double calcVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	/**
     * Calculates the base area of the cylinder.
     * Formula: pi * r²
     *
     * @return the area of the circular base
     */

	@Override
	public double calcBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
