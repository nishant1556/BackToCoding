package com.nishant.begin;

public class Binary {
	
	public static void getBinary(int input) {
		int temp = input/2;
		if(temp==0)
			System.out.print(input%2+" ");
		else {
			getBinary(temp);
			System.out.print(input%2+" ");
		}
	}

}
