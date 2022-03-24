package com.programminghelp;

public class ArraySearchInteger {

	public static void main(String[] args) {
       
		boolean z=searchIntegerArray(1, 2,3,4,5,6,7,8);
		System.out.println(z);
	}

	public static boolean searchIntegerArray(Integer search, Integer... inputArray) {
		for (Integer integer : inputArray) {
			if (integer == search)
				return true;
		}
		return false;
	}

}
