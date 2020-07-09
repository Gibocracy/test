<<<<<<< HEAD
import java.util.Scanner;

		/* you have to give someone change
		 * what coins do you give that person?
		 * Requirements: takes user input and displays the change breakdown as output

		 * 1. Understand and Define the Problem:
		 * ask user for input, US coins 
		 * (quarter, dime, nickel, penny), max change: 99¢
		 * display coin output
		 * What’s involved?
		 * Write java docs to explain your program and algorithms.

		 * 2. Determine Input and Output
		 * Typed input by user: amount of change requested (an integer between 1 and 99)
		 * Printed output:
		 * Number of quarters given
		 * Number of dimes given
		 * Number of nickels given
		 * Number of pennies given
		 * Note: if there are no quarters as change we should not display "0 quarter".
		 * Only print the expected change. Example change = 6 cents Output should be: 1
		 * Nickels 1 Pennies*/

public class Week1ChangeMaker {
	static Scanner myScanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		//Declare amountOfCoins, this number will represent the amount of change
		double amountOfCoins; 

		// Declare variables for modulus math
		int quarterAmount, dimeAmount, nickelAmount, pennieAmount;

		// Input for amount of change requested.
		System.out.print("Amount of change requested: ");
		amountOfCoins = myScanner.nextInt(); //Input double for amountOfCoins into scanner
		
/* Coin amount must go in this order: quarterAmount, dimeAmount, nickleAmount,pennieAmount
 * It will give the correct amount of change otherwise Example, if pennies is first and your
 * amountOfCoins equals 99 theyn out put will be 99 pennies amountOfCoins is divided 
 * by 25, 10, 5, and 1; each is followed by an %= in the same order as variable*/
		
		quarterAmount = (int) (amountOfCoins / 25); amountOfCoins %= 25; 
		dimeAmount = (int) (amountOfCoins / 10); 	amountOfCoins %= 10; 
		nickelAmount = (int) (amountOfCoins / 5);	amountOfCoins %= 5;
		pennieAmount = (int) (amountOfCoins / 1);	amountOfCoins %= 1;

/* The while loop will ensure that ONLY the expected change is 
 * printed, example quarterAmount does not equal 0 then print quaterAmount.*/		
		while (quarterAmount !=0) {
		System.out.println("Number of Quarters: " + quarterAmount);
		break;
		}
		while (dimeAmount !=0) {
		System.out.println("Number of Dimes:    " + dimeAmount);
		break;
		}
		while (nickelAmount !=0) {
		System.out.println("Number of Nickels:  " + nickelAmount);
		break;
		}
		while (pennieAmount !=0) {
		System.out.println("Number of Pennies:  " + pennieAmount);
		break;
		}
		

	}

}
=======
import java.util.Scanner;

		/* you have to give someone change
		 * what coins do you give that person?
		 * Requirements: takes user input and displays the change breakdown as output

		 * 1. Understand and Define the Problem:
		 * ask user for input, US coins 
		 * (quarter, dime, nickel, penny), max change: 99Â¢
		 * display coin output
		 * Whatâ€™s involved?
		 * Write java docs to explain your program and algorithms.

		 * 2. Determine Input and Output
		 * Typed input by user: amount of change requested (an integer between 1 and 99)
		 * Printed output:
		 * Number of quarters given
		 * Number of dimes given
		 * Number of nickels given
		 * Number of pennies given
		 * Note: if there are no quarters as change we should not display "0 quarter".
		 * Only print the expected change. Example change = 6 cents Output should be: 1
		 * Nickels 1 Pennies*/

public class Week1ChangeMaker {
	static Scanner myScanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		//Declare amountOfCoins, this number will represent the amount of change
		double amountOfCoins; 

		// Declare variables for modulus math
		int quarterAmount, dimeAmount, nickelAmount, pennieAmount;

		// Input for amount of change requested.
		System.out.print("Amount of change requested: ");
		amountOfCoins = myScanner.nextInt(); //Input double for amountOfCoins into scanner
		
/* Coin amount must go in this order: quarterAmount, dimeAmount, nickleAmount,pennieAmount
 * It will give the incorrect amount of change otherwise Example, if pennies is first and your
 * amountOfCoins equals 99 theyn out put will be 99 pennies amountOfCoins is divided 
 * by 25, 10, 5, and 1; each is followed by an %= in the same order as variable*/
		
		quarterAmount = (int) (amountOfCoins / 25); amountOfCoins %= 25; 
		dimeAmount = (int) (amountOfCoins / 10); 	amountOfCoins %= 10; 
		nickelAmount = (int) (amountOfCoins / 5);	amountOfCoins %= 5;
		pennieAmount = (int) (amountOfCoins / 1);	amountOfCoins %= 1;

/* The while loop will ensure that ONLY the expected change is 
 * printed, example quarterAmount does not equal 0 then print quaterAmount.*/		
		while (quarterAmount !=0) {
		System.out.println("Number of Quarters: " + quarterAmount);
		break;
		}
		while (dimeAmount !=0) {
		System.out.println("Number of Dimes:    " + dimeAmount);
		break;
		}
		while (nickelAmount !=0) {
		System.out.println("Number of Nickels:  " + nickelAmount);
		break;
		}
		while (pennieAmount !=0) {
		System.out.println("Number of Pennies:  " + pennieAmount);
		break;
		}
		

	}

}
>>>>>>> f24b63b9fdd697dc149028c9e6e3eff111227e06
