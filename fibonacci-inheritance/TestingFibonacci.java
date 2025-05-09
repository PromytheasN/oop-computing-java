package fibonacci;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.BigInteger;

public class TestingFibonacci {
	final static int QUIT = 5;

	public static void displayMenu() {
		System.out.println("\t\t ===================== ");
		System.out.println("\t\tFibonacci Computation ");
		System.out.println("\t\t ===================== ");
		System.out.println("\t| -1 - Using Recursion ");
		System.out.println("\t| -2 - Using Iteration ");
		System.out.println("\t| -3 - Using Tail Recursion ");
		System.out.println("\t| -4 - Using Memoization ");
		System.out.println("\t| -5 - Quit \n");
		System.out.print("\t| Enter your choice 1 -5: ");
	}

	public static int getMenuChoice() {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		try {
			// get input from the keyboard
			choice = keyboard.nextInt();
			// System.out.println ("x = " + x); // debug
			while ((1 > choice) || (choice > QUIT)) {
				System.out.println("\n\tError : Invalid entry .");
				System.out.print("\n\tEnter the number corresponding to the menu entry (1 -9): ");
				choice = keyboard.nextInt();
			}
		} catch (InputMismatchException ex) {
			// The input type was wrong (eg. a letter ).
			System.err.println("\t|You must enter an integer between 1 and 5.");
			System.exit(1);
		} catch (Exception ex) { // all other exceptions
			System.err.println("\t| Something went wrong !");
			System.exit(1);

		}
		return choice;
	}

	public static void displayHeader() {
		System.out.println("\t ============================= ");
		System.out.println("\t| Computing Fibonacci Sequence \n");
		System.out.println("\t ============================= ");
		System.out.println("\t|N\t# of Digits of Fib (N)\t\tTime to Compute ( Seconds )");
		System.out.println("\t==\t =====================\t\t ========================= ");
	}

	public static void main(String[] args) {
		int choice = 1;
		int i;
		long start, end;
		BigInteger x = BigInteger.valueOf(-1);
		Fibonacci fibonacci = new FibonacciComputation();
		do {
			displayMenu();
			choice = getMenuChoice();
			switch (choice) {
			case 1:
				displayHeader();
				for (i = 2; i < 1001; i++) {
					start = System.currentTimeMillis();
					x = fibonacci.usingRecursion(i);
					end = System.currentTimeMillis();
					float duration = (float) (end - start) / 1000;
					System.out.printf("\t|%-3d\t%,-10d\t\t\t%.2f\t\n", i, x.toString().length(), duration);
				}
				System.out.printf("\t| Fib (%d)=%d\n", i - 1, x);
				break;
			case 2:
				displayHeader();
				for (i = 2; i < 1001; i++) {
					start = System.currentTimeMillis();
					x = fibonacci.usingIteration(i);
					end = System.currentTimeMillis();
					float duration = (float) (end - start) / 1000;
					System.out.printf("\t|%-3d\t%,-10d\t\t\t%.2f\t\n", i, x.toString().length(), duration);
				}
				System.out.printf("\t| Fib (%d)=%d\n", i - 1, x);
				break;
			case 3:
				displayHeader();
				for (i = 2; i < 1001; i++) {
					start = System.currentTimeMillis();
					x = fibonacci.usingTailRecursion(i, BigInteger.ZERO, BigInteger.ONE);
					end = System.currentTimeMillis();
					float duration = (float) (end - start) / 1000;
					System.out.printf("\t|%-3d\t%,-10d\t\t\t%.2f\t\n", i, x.toString().length(), duration);
				}
				System.out.printf("\t| Fib (%d)=%d\n", i - 1, x);
				break;
			case 4:
				HashMap<Integer, BigInteger> cache = new HashMap<Integer, BigInteger>();
				displayHeader();
				for (i = 2; i < 1001; i++) {
					start = System.currentTimeMillis();
					x = fibonacci.usingMemoization(i, cache);
					end = System.currentTimeMillis();
					float duration = (float) (end - start) / 1000;
					System.out.printf("\t|%-3d\t%,-20d\t\t\t%.2f\t\n", i, x.toString().length(), duration);
				}
				System.out.printf("\t| Fib (%d)=%d\n", i, x);
				break;

			case 5:
				System.out.println("\t|You chose to quit !");
				System.exit(0);
				break;
			default:
				System.out.println("\t|You should not be here !");
			}
		} while (choice != QUIT);

	}

}
