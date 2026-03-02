/**
 *  @author Team Sidon - Aaron Reid, Joshua Couto, Kaley Wood, Ryan Burns
 *  Southern Alberta Institute of Technology: CPRG-304-B
 *  Assignment 1: Complexity & Sorting
 *  Created: 02.18.2026
 */

package appDomain;

/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304 
 * W2026 class at SAIT. The implementors of this applications will be required
 * to add all the correct functionality.
 * </p>
 */
public class AppDriver
{
	/**
	 *  The main method is the entry point of the application.
	 *  
	 *  @param args The input to control the execution of the application.
	 */
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo00 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)
		
		
		
		
		// -----------------------------
		// Command-line variables
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
		}
		if ("bsimqz".indexOf(sortType) == -1) {
			System.out.println("Invalid sort type");
			System.out.println("Valid sort options: bubble (b), selection (s), insertion (i), merge (m), quick (q), or shell (z)\n");
		}
		

	}

}
