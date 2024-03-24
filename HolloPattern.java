
// Java Program to print Pattern
// Hollow Diamond Star
import java.util.*;

public class HolloPattern {

	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;
		int num = 1;
		// outer loop to handle upper part
		for (i = 1; i <= n; i++) {
			// inner loop to print spaces
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		// outer loop to handle lower part
		for (i = n-1; i >= 1; i--) {
			// inner loop to print spaces
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}


// Java Program to print 
// Hollow triangle pattern
// import java.util.*;

// public class HolloPattern {
// 	// Function to demonstrate pattern
// 	public static void printPattern(int n)
// 	{
// 		int i, j, k;

// 		// outer loop to handle rows
// 		for (i = 1; i <= n; i++) {
		
// 			// inner loop to print spaces.
// 			for (j = i; j < n; j++) {
// 				System.out.print(" ");
// 			}
		
// 			for (k = 1; k <= (2 * i - 1); k++) {
// 				// printing stars.
// 				if (k == 1 || i == n || k == (2 * i - 1)) {
// 					System.out.print("*");
// 				}
// 				// printing spaces.
// 				else {
// 					System.out.print(" ");
// 				}
// 			}

// 			System.out.println("");
// 		}
// 	}

// 	// Driver Function
// 	public static void main(String args[])
// 	{
// 		int n = 6;
// 		printPattern(n);
// 	}
// }


// Java Program to print pattern
// Reverse Hollow triangle

// import java.util.*;

// public class HolloPattern {
// 	// Function to demonstrate pattern
// 	public static void printPattern(int n)
// 	{
// 		int i, j, k;

// 		// outer loop to handle rows
// 		for (i = n; i >= 1; i--) {

// 			// inner loop to print spaces.
// 			for (j = i; j < n; j++) {
// 				System.out.print(" ");
// 			}

// 			for (k = 1; k <= (2 * i - 1); k++) {
// 				// printing stars.
// 				if (k == 1 || i == n || k == (2 * i - 1)) {
// 					System.out.print("*");
// 				}
// 				// printing spaces.
// 				else {
// 					System.out.print(" ");
// 				}
// 			}

// 			System.out.println("");
// 		}
// 	}

// 	// Driver Function
// 	public static void main(String args[])
// 	{
// 		int n = 6;
// 		printPattern(n);
// 	}
// }
