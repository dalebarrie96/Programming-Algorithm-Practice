package dbarrie.algorithms.cheatsheet;

import java.util.Scanner;

/**
 * From some research there seems to be 2 main ways to solve if a number is power of in java
 * that doesn't use bitwise operations (id prefer to avoid these if possible).
 * 
 * @author Dale
 *
 */
public class SolvePowerOf {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int pow = sc.nextInt();
		
		System.out.println("Using Log = " + isPowerOfLog(value, pow));
		System.out.println("Using Log = " + isPowerOfDev(value, pow));
	}
	
	/**
	 * This method used logorithm to check if a given value is a power of a given number.
	 * 
	 * This method takes the log of the value using the power as a base. If we get a whole number (integer)
	 * then we know that the value is the power of the given number
	 * 
	 * @param pow
	 * @param value
	 * @return true if value^pow (value is the power of pow)
	 */
	public static boolean isPowerOfLog(int value, int pow) {
		return (int)(Math.ceil((Math.log(value) / Math.log(pow)))) 
	            == (int)(Math.floor(((Math.log(value) / Math.log(pow)))));
	}
	
	/**
	 * This method uses devision to check if a given value is a power of a given number.
	 * 
	 * This methods repeatedly divides by the power, if any remainder is non-zero or the value 
	 * doesn't become 1 then we know that the value is not a power of the given number.
	 * 
	 * 
	 * @param pow
	 * @param value
	 * @return true if value^pow (value is the power of pow)
	 */
	public static boolean isPowerOfDev(int value, int pow) {
		if (value == 0)
            return false;
  
        while (value != 1) {
            if (value % pow != 0)
                return false;
            value = value / pow;
        }
        return true;
	}

}
