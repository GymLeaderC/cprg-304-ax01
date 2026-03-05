/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package appDomain;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import shapes.*;
import utilities.*;

/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304 
 * W2026 class at SAIT. The implementors of this applications will be required
 * to add all the correct functionality.
 * </p>
 */
public class AppDriver {
	/**
	 *  The main method is the entry point of the application
	 *  @param args The input to control the execution of the application.
	 *  @throws FileNotFoundException 
	 */
	public static void main( String[] args ) throws FileNotFoundException {
		
		// ----------------------
		// Command-line Variables
		
		String fileName = null;
		char compareType = ' ';
		char sortType = ' ';
		
		// Assign command-line arguments
		for (String arg: args) {
			arg = arg.toLowerCase();
			
			// Assign filename
			if (arg.startsWith("-f")) {
				fileName = arg.substring(2);
			}
			
			// Assign compare-type
			// (Compare by height (h), volume (v), or base area (a))
			else if (arg.startsWith("-t")) {
				compareType = arg.charAt(2);
			}
			
			// Assign sort-type
			// (Sort using bubble (b), selection (s), insertion (i), merge (m), quick (q), or shell (z))
			else if (arg.startsWith("-s")) {
				sortType = arg.charAt(2);
			}
			
			// Invalid input
			else {
				System.out.println("Invalid command-line input: \"" + arg + "\"");
			}
		}
		
		// Validate compare-type and sort-type user inputs
		// (Assume user will provide the correct absolute or relative file path)
		if ("hva".indexOf(compareType) == -1) {
			System.out.println("Invalid compare type");
			System.out.println("Valid compare options: height (h), volume (v), or base area (a)\n");
			return;
		}
		if ("bsimqz".indexOf(sortType) == -1) {
			System.out.println("Invalid sort type");
			System.out.println("Valid sort options: bubble (b), selection (s), insertion (i), merge (m), quick (q), or shell (z)\n");
			return;
		}
		
		// -------------------------------
		// File Reading and Shape Creation
		
		// Declare shapes array for use after file reading
		Shape[] shapes = null;
		
		// Open file, read shape count, create array
		try (Scanner scanner = new Scanner(new File(fileName))) {
            int numOfShapes = Integer.parseInt(scanner.nextLine().trim());
            shapes = new Shape[numOfShapes];
        
            // Loop through each line, split into parts
            for ( int i=0 ; i < numOfShapes ; i++ ) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                
                // Create the correct shape object by type
                switch ( parts[0] ) {
                    case "Cone":
                        shapes[i] = new Cone( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "Cylinder":
                        shapes[i] = new Cylinder( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "OctagonalPrism":
                        shapes[i] = new OctagonalPrism( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "PentagonalPrism":
                        shapes[i] = new PentagonalPrism( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "Pyramid":
                        shapes[i] = new Pyramid( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "SquarePrism":
                        shapes[i] = new SquarePrism( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                    case "TriangularPrism":
                        shapes[i] = new TriangularPrism( Double.parseDouble(parts[1]), Double.parseDouble(parts[2]) );
                        break;
                }
            }
        }
		
		// --------------------------------------------
		// Sorting Algorithm Selection and Benchmarking
		
		SortAlgorithm sorter = null;
		
		// Select sorting algorithm based on user input
		switch ( sortType ) {
			case 'b': sorter = new BubbleSort(); 
				break;
			case 'i': sorter = new InsertionSort();
				break;
			case 'm': sorter = new MergeSort();
				break;
			case 'q': sorter = new QuickSort();
				break;
			case 's': sorter = new SelectionSort();
				break;
			case 'z': sorter = new ShellSort();
				break;
		}
		
		// Record start time before sorting
		long start = System.currentTimeMillis();
		
		// Sort shapes using selected comparison strategy
		if ( compareType == 'h' ) {
			sorter.sort(shapes);
		}
		else if ( compareType == 'a' ) {
			sorter.sort(shapes, new BaseAreaComparator());
		} else {
			sorter.sort(shapes, new VolumeComparator());
		}
		
		// Record end time
		long end = System.currentTimeMillis();
		
		// -----------------------------
		// Displaying Results to Console
		

		// Set display label based on comparison type
		String compareString = null;
		if (compareType == 'h') {
		    compareString = "Height: ";
		} else if (compareType == 'a') {
		    compareString = "Area: ";
		} else {
		    compareString = "Volume: ";
		}
		
		// Print the first element in the array
		System.out.println("First element is: " + shapes[0] + " " + compareString + " " + getValue(shapes[0], compareType));
		
		// Print each thousandth element in the array
		for (int i = 999; i < shapes.length; i = i + 1000) {
			System.out.println((i + 1) + "-th element: " + shapes[i] + " " + compareString + " " + getValue(shapes[i], compareType));
		}
		
		// Print the last element in the array only if the loop DID NOT already print it
		int lastIndex = shapes.length - 1;
		if (lastIndex % 1000 != 999) {
			System.out.println("Last element is: " + shapes[shapes.length - 1] + " " + compareString + " " + getValue(shapes[shapes.length - 1], compareType));
		}
		
		// Print the run time
		System.out.println(sortType + " run time was: " + (end - start) + " milliseconds");
	}
		
	/**
	 * Returns the comparison value for a shape based on the compare type.
	 * @param shape The shape to get the value from.
	 * @param compareType The comparison type (h, a, or v).
	 * @return The height, base area, or volume of the shape.
	 */
	private static double getValue(Shape shape, char compareType) {
		if (compareType == 'h') {
			return shape.getHeight();
		} else if (compareType == 'a') {
			return shape.calcBaseArea();
		} else {
			return shape.calcVolume();
		}
	}

}
