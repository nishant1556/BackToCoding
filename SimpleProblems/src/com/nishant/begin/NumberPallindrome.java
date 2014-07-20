package com.nishant.begin;

import java.util.ArrayList;
import java.util.List;

public class NumberPallindrome {
	private static List<Integer>digits;
	public static String checkNumberPallindrome(int inputNumber) {
		int numberOfDigits = countNumberOfDigits(inputNumber);
		if(digits.size() == 1)
			return "Pallindrome";
		for(int i=0, j=digits.size()-1; i<digits.size()/2; i++, j--) {
			if(digits.get(i) != digits.get(j))
				return "Not Pallindrome";
		}
		
		return "Pallindrome";
	}
	
	private static int countNumberOfDigits(int num) {
		digits = new ArrayList<Integer>();
		int numberOfDigits = 0;
		while(num != 0) {
			int digit = num % 10;
			digits.add(digit);
			numberOfDigits++;
			num = num/10;
		}
		return numberOfDigits;
	}

}
