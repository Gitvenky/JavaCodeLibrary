package com.venkatesh.coreJava;

public class IncrementAndDecrement {

	/*
	 * nesting not allowed ++(++) . can't perform the operator on the constants.
	 * can't perform on the final variables . except boolean every primitive type
	 * can be incremented or decremented.. after applying the arithmetic operation
	 * --> max(int, type of a, type of b) incase of ++ and -- internal type casting
	 * will be performed automatically
	 */
	public static void main(String[] args) {

		int i = 0X0A0F;
		int j = 0X2022;
		System.out.println("i is :" + i + " and j is " + j + "and " + (i & j));
	}

}
