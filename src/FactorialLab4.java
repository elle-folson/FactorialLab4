
/* Calculate the factorial of a number
 * Prompt the user to enter an integer from 1 to 10
 * Display the factorial number entered by the user
 * Prompt the user to continue
 */
import java.util.*;

public class FactorialLab4 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		String choice = "y";

		// user input integer prompt
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter an integer that's greater than 0 but " + "less than 10: ");
			int num1 = input.nextInt();
			
			long fact = 1;

			for (int i = 1; i <= num1; i++) {
				fact = i * fact;
			}

			// display the factorial of the number entered by the user
			System.out.println("The factorial of " + num1 + " is " + fact);

			System.out.println();
		
		// see if the user wants to continue
		System.out.print("Continue?? (y/n): ");
		choice = input.next();
		System.out.println();
		}
		input.close();
	}
}
