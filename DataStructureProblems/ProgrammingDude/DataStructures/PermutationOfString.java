package ProgrammingDude.DataStructures;

import java.util.Arrays;

public class PermutationOfString {

	public static void main(String[] args) {
		String first = "abcd";
		String second = "bacd";

		boolean isPermutaion = checkForPermutation(first, second);
		System.out.println("The two given Strings are permutaions of each Other : " + isPermutaion);
	}

	private static boolean checkForPermutation(String first, String second) {
		char[] firstCharArray = first.toCharArray();
		char[] secondCharArray = second.toCharArray();
		
		Arrays.sort(firstCharArray);
		Arrays.sort(secondCharArray);
		
		boolean isEqual = Arrays.equals(firstCharArray , secondCharArray);		
		return isEqual;
	}

	
}
