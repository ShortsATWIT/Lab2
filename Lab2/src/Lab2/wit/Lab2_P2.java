/*********************************************************************
*	LAB 2 - Problem 2
**********************************************************************/

package Lab2.wit;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Lab2_P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		// Prompt user for amount of values
		Scanner input = new Scanner(System.in);
		int numv = 0;
		System.out.println("Enter the number of values: ");
		// Take input from user
		numv = input.nextInt();
		int arr[]=new int[numv];
		System.out.println("Enter the number: ");
		for(int i=0; i < numv; i++) {
			arr[i]=input.nextInt();
		// Asks if there's 4 numbers consecutively
		} if(isConsecutiveFour(arr)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}
		
		
	}

	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		int numc=values[0];
		int count = 1;
		// Asks if value is equal to value before
		for(int i = 1; i<values.length; i++) {
			if(values[i]==numc) {
				count++;
			} else {
				numc=values[i];
				count=1;
			} if(count == 4) {
			// If 4 in a row, outcome is true
				return true;
			}
			// If not 4 in a row, outcome is false
		} return false;
	}
}


