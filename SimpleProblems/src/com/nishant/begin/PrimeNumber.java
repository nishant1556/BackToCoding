package com.nishant.begin;

public class PrimeNumber {
	
	public static String checkForPrime(int inputNumber) {
		int i;
		for(i=2; i<inputNumber/2; i++) {
			if((inputNumber % i) == 0)
				break;
		}
		if(i >= (inputNumber/2))
			return "Prime";
		return "Not A Prime";
	}

}
