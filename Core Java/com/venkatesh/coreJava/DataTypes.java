package com.venkatesh.coreJava;

public class DataTypes {

	// Signed Data types
	byte a = 64;
	short k = 123;
	int l = 67676;
	long m = 8989;
	float f = 10;
	double g = 1098.8989;

	// unsigned Data types
	char d = 't';
	boolean isJava = true;

	/*********************************************************************
	 * byte:- in 8 bits the first one which is most significant bit acts as sign
	 * bit. range is from -128 to + 127
	 * 
	 * +ve numbers are represented directly in the memory whereas negative numbers
	 * are store din 2's complements form
	 *
	 * Best suitable to handle the data either from streams or from the n/w.
	 *********************************************************************/

	byte x = 64;
	byte y = -128;
	byte z = (byte) 129;
	// byte z = 129;
	// byte b="G"

	/*********************************************************************
	 * Short:- in 2 bytes(16 bits). range is from -2^15(32768) to 2^15-1(32767) Best
	 * suitable to 16 bit processors
	 *********************************************************************/

	short s = 32676;

	/*********************************************************************
	 * int:- in 4 bytes(32 bits). range is from -2^31(2147483648) to
	 * 2^31-1(2147483647) Best suitable to 16 bit processors
	 *********************************************************************/

	int s1 = -2147483648;

	/*********************************************************************
	 * long:- in 8 bytes(64 bits). range is from -2^63 to 2^63-1
	 * 
	 *********************************************************************/

	long s3 = -2147483648;

	/**********************************************
	 * float size is 4 bytes, from -3.4e38 to 3.4e38 double size is 8 bites, from
	 * -1.7e308 to 1.7e308 char size is 2 bytes, from 0 to 65535 boolean has no
	 * size, no range. null is not applicable for the primitive values and is only
	 * applicable to Object references.
	 ********************************************/

	char myChar = 655;
	static long factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 

	public static void main(String[] args) {
		DataTypes d = new DataTypes();
		System.out.println(d.z);
		System.out.println(d.myChar);
		/*
		 * for(char i=0; i<= 65535 ; i++) {
		 * 
		 * char mych=i; System.out.println("the char variable corresponds to " +mych+
		 * " is " +mych); }
		 */
		System.out.println("the factorial of 100 is "+ factorial(30) );
	}

}
