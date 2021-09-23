package com.venkatesh.coreJava;

public class Arrays {
	@SuppressWarnings(value = { "unused" })
	public static void main(String[] args) {

		/* indexed collection of finite number of homogeneous elements */
		/*** declaration of array ***/
		int[] x;
		int[] y;
		int z[];

		/** at the time of declaration we can't specify the size **/
		// int i[6];// is wrong

		/** multi dimensional arrays **/

		int c[][][];
		int[][] j[];
		int[] k[][];

		/** Vaild declations */

		int[] s, a;
		int[] sh, ah[];
		// int pg,[]tg;//invalid declare all the arrays first and then variables,
		
		/** Creation of Arrays */
		int hj[] = new int[0];
		int hk[] = new int[10];
		System.out.println(hk.getClass().getName());// this is of [I --> type		
		int hl[] = new int[-9];// RE: 
		//allowed data types to specify the Array size are--> int, short, byte, long
		// the max size available is max size of int, 2^32.
		
		/***Array initialization*/
		
		int kl[] = new int[3];
		//all the values are initialized to default values
		
		/**all in a single line must, declaration, creation and initilization**/
		int nums[] = {1,2,4,5,6,6,};
		char chars[] = {'s','d','f','g',};
		int nums2[][] = {{1,2,4},{4,5,6}};
		int nums3[][][] = {{{1,2,4},{4,5,6}},{{7,2,4},{4,5,6}}};
		System.out.println(nums[5]);
		
		//length is applicable for arrays , length() is applicable for String
		int lengthOfCharsArray=chars.length;
		int lengthOfString = "venkatesh".length();
		int nums3Length= nums3.length;
		System.out.println("nums3.lengts is "+nums3Length);// 2
		
		int anonymous[] = new int[] {1,2,3,4};
		// assigning the child types(abstract class, child classes, interface types)
		Runnable r[] = new Runnable[10];
		Runnable t[] = new Thread[10];

		//array variable assignment		
		int[] copy1 = {2,3};
		int[] copy2 = {4,5};		
		copy1=copy2;
		
		int[] copy3 = {2,3};
		char[] copy4 = {'g',5};		
//		copy3=copy4;
//		copy4= copy3;
		
		String[] str = {"a","gd"};
		Object[] obj = str;
		
		
		
		
		
		
	}
	public void varArgs( int ...x) {}
	public void varArgs1( int... x) {}
	public void varArgs2( int...x) {}
	
	public void mixed( int...x) {}
	//public void varArgs2Invalid( int...x,int t) {}
	//public void varArgs2Invalid( double... t,int...x) {}
	
	// arrays can be replaced with var-arg method but not otherwise.
}
