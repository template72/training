package com.github.template72.training;

/**
 * Addition operations executer
 */
public class Adder {

	/**
	 * Adds first and second number
	 * 
	 * @param i the first number
	 * @param j the second number
	 * @return the result
	 */
	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, Integer k) {
		int result = i + k;
		return result + j;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
}
