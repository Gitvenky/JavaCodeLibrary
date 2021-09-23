package com.venkatesh.Abstraction;

public abstract class AbstractClass {
	/*
	 * Abstract keyword can be used to the class even though there is no 
	 * abstract method in that class
	 * 
	 * Abstract Class can contain main method and can be compiled and executed.
	 * 
	 * Constructor in the abstract class is used to call the instance variables and
	 *  instance methods. 
	 * 
	 * */
	
	public AbstractClass() {
		System.out.println("AbstrctClass-->Constructor called");
	}
	
	public void message() {
		System.out.println("AbstrctClass-->message method is called");
	}
	
	public  static void run() {
		
		System.out.println("AbstrctClass-->run method is called");
	}
	public static void main(String[] args) {
		run();
	}
}
