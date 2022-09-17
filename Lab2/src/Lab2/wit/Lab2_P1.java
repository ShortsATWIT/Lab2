/*********************************************************************
*	LAB 2 - Problem 1
**********************************************************************/

package Lab2.wit;

import java.util.Scanner;

public class Lab2_P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);

		// Asks the user to enter a credit card number
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		System.out.println(
			number + " is " + (isValid(number) ? "valid" : "invalid"));
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// TODO: write your code here
		boolean valid =
				// Checks beginning digits of card
				(getSize(number) >= 13 && getSize(number) <= 16) &&
				(prefixMatched(number, 4) || prefixMatched(number, 5) ||
				prefixMatched(number, 37) || prefixMatched(number, 6)) &&
				((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

			return valid;
		}
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		// TODO: write your code here
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// TODO: write your code here
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}
	

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		// TODO: write your code here
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// TODO: write your code here
		return getPrefix(number, getSize(d)) == d;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		// TODO: write your code here
		String num = d + "";
		return num.length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		if (getSize(number) > k)  {
			String num = number + "";
			return  Long.parseLong(num.substring(0, k));
		}
		return number;
	}
}