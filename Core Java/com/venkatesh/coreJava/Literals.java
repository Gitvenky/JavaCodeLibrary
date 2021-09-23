package com.venkatesh.coreJava;

public class Literals {

	/*************
	 * Literals: Decimal(values are from 0-9) Octal(prefixed with 0, values are from
	 * 0-7) HexaDecimal(Prefixed with 0x or 0X, range is from 0-9 and a-f or A-F)
	 */

	// int x = 0786; // octal representation there's no 8
	int y = 0XFACE;// hexa decimal
	int z = 0767;// octal
	long l = 10L;
	long m = 10;
	int binaryForm = 0b1111;
	int binaryForm2 = 0B0101;
	int underscoreForm = 1_2_3_4;

	double d = 10.8989d;
	double df = 10.89898;
	double yd = 0XFACE;
	double zd = 0767;
	double underscoreForm3 = 1_2_3_4.78_9;
	double underscoreForm2 = 1_2_3_4.8_76;
	double underscoreForm6 = 1_2_3_4.8_76;

	float myf = 10f;
	float myt = 10L;
	float myk = 10f;

	boolean bo = true;
	boolean fs = false;

	char ch = 87;
	char ch1 = 'a';
	char ch2 = 0777;
	char ch3 = 0XFACE;
	/** only '\\uXXXX' is valid, XXXX is hexadecimal **/
	char unicode = '\uface';
	char unicode2 = '\uface';
	char unicode3 = '\uface';
	char unicode4 = '\uface';
	char escape = '\n';
	char escape1 = '\t';
	char escape2 = '\r';
	char escape3 = '\b';
	char escape4 = '\f';
	char escape5 = '\"';
	char escape6 = '\'';
	char escape7 = '\\';

}
