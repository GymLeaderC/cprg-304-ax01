/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package shapes;

public class Cylinder extends Shape {
	double radius;

	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
