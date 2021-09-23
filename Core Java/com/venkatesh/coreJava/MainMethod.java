package com.venkatesh.coreJava;

public class MainMethod {
	// valid
	strictfp synchronized final public static void main(String[] args) {

	}

	// valid
	strictfp synchronized final public static void main(int... args) {

	}
	
	// valid
		strictfp synchronized final public static void main(double... args) {

		}

	/**********
	 * in case of inheritance if the child class method does not contain the main
	 * method, parent main will be executed.
	 * 
	 * in case both the child and parent contain the main method then it is called
	 * method hiding not overriding, individual main methods will be called.
	 * 
	 * until 1.6 we get no such method, from 1.7 we get main method not found.
	 */
}
