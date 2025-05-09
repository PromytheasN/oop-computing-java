import java.util.Scanner;

/**
 * @author Alexander Kemos
 * @version 1.0
 * @since 
 */

/*
 * This program prints a menu of choices, accepts user input
 * and prints min or max value of Byte, Short, Int or Long 
 * according to users input.
 */
public class Assignment1 {

	final static int QUIT = 9;
	
	//Display menu with options
	public static void displayMenu() {
		String doubleHyphen = "=============";
		System.out.printf("%24s \n", doubleHyphen);
		System.out.printf("%24s\n", "Assignment #1");
		System.out.printf("%24s \n", doubleHyphen);
		System.out.printf("%1s","-1- Compute byte data minimum value\n");
		System.out.printf("%1s","-2- Compute byte data maximum value\n");
		System.out.printf("%1s","-3- Compute short data minimum value\n");
		System.out.printf("%1s","-4- Compute short data maximum value\n");
		System.out.printf("%1s","-5- Compute int data minimum value\n");
		System.out.printf("%1s","-6- Compute int data maximum value\n");
		System.out.printf("%1s","-7- Compute long data minimum value\n");
		System.out.printf("%1s","-8- Compute long data maximum value\n");
		System.out.printf("%1s", "-9- Quit\n\n");
		System.out.printf("%1s", "Enter your choice 1-9:\n");
	}
	
	//Get user input
	public static int getMenuChoice() {
		Scanner userInput = new Scanner(System.in);
		int inVal = -1;
		
		try {
			
			inVal = userInput.nextInt();
			while((inVal < 1) || (inVal > 9)) {
				Thread.sleep(2000);
				displayMenu();
				inVal = userInput.nextInt();
			}
		} catch (Exception ex) {
			System.out.println("Invalid user input.");
			ex.printStackTrace();
		}
		finally{
		}
		return inVal;	
	}
	//return the minimum value of the byte data type
	static int getMinimumByte(){	
		Byte aByte = -1;
		aByte = (byte) (aByte << 7);
		return (int)aByte;

	}
	//Return the maximum value of the byte data type
	static int getMaximumByte() {
		Byte aByte = -1;
		aByte = (byte) (aByte << 7);
		aByte = (byte)(~aByte);
		return (int)aByte;
	}
	//Return the minimum value of the short data type
	static int getMinimumShort(){
		Short aShort = -1;
		aShort = (short) (aShort << 15);
		return aShort;		
	}
	//Return the maximum value of the short data type
	static int getMaximumShort() {
		Short aShort = -1;
		aShort = (short) (aShort << 15);
		aShort = (short)(~aShort);
		return (int)(aShort);
	}
	//Return the minimum value of the Int data type
	static int getMinimumInt() {
		int num = -1;
		num = (num << 31);
		return num;
	}
	//Return the maximum value of the Int data type
	static int getMaximumInt() {
		int num = -1;
		num = (num << 31);
		return (~num);
	}
	//Return the minimum value of the Long data type
	static long getMinimumLong() {
		Long aLong = (long) -1;
		aLong = (long)(aLong << 63);
		return aLong;
	}
	//Return the maximum value of the Lond data type
	static long getMaximumLong() {
		Long aLong = (long) -1;
		aLong = (long)(aLong << 63);
		return (long)(~aLong);
	}
	
	//Delay system by d nanoseconds
	public static void timeDelay(long d) {
		try {
			Thread.sleep(d);
		}
		catch(Exception e){
		}
	}
	public static void main(String[] args) {
		
		//Display output stream with 2 seconds delay
		//Get user input
		long delay = 2000;
		displayMenu();
		int intVal = getMenuChoice();
		
		//Call functions based on user input
		while(true) {
			if(intVal == 1) {
				System.out.println(getMinimumByte());
			}
			else if(intVal == 2) {
				System.out.println(getMaximumByte());
			}
			else if(intVal == 3) {
				System.out.println(getMinimumShort());
			}
			else if(intVal == 4) {
				System.out.println(getMaximumShort());
			}
			else if(intVal == 5) {
				System.out.println(getMinimumInt());
			}
			else if(intVal == 6) {
				System.out.println(getMaximumInt());
			}
			else if(intVal == 7) {
				System.out.println(getMinimumLong());
			}
			else if(intVal == 8) {
				System.out.println(getMaximumLong());
			}
			else if(intVal == QUIT) {
				System.out.println("Exiting program!");
				System.exit(0);
			}
			timeDelay(delay);
			displayMenu();
			intVal = getMenuChoice();
		}
	}
}
