/*
 * Nicholas Casey
 * 5/20/2024
 * The purpose of this class is to
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 */

package edu_seminolestate.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println("The nth term of the Fibonacci sequence is: " + nthTermOfFibonacci(10));
	}

	public static int nthTermOfFibonacci(int n) {
		if (n == 0)      // Base case
			return 0;
		else if (n == 1) // Base case
			return 1;
		else 
			return nthTermOfFibonacci(n - 1) + nthTermOfFibonacci(n -2);
	}
}
