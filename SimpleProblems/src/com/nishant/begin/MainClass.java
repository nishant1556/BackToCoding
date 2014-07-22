package com.nishant.begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nishant.begin.sorting.BubbleSort;

public class MainClass {

	public static void main(String[] args) throws IOException{
		int userChoice;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This is project which has certain simple Java functions.\nFollow the instructions");
		System.out.println("1>>>>OddEven\n2>>>>PrimeNumber\n3>>>>NumberPallindrome\n4>>>>BubbleSort\n5>>>>Exit");
		userChoice = Integer.parseInt(in.readLine());
		do {
			switch(userChoice) {
			case 1:
				System.out.println("Enter the number:");
				int inputNumber = Integer.parseInt(in.readLine());
				System.out.println("The number is:"+OddEven.checkOddOrEven(inputNumber));
				break;
			case 2:
				System.out.println("Enter the number:");
				int inputNumber2 = Integer.parseInt(in.readLine());
				System.out.println("The number is:"+PrimeNumber.checkForPrime(inputNumber2));
				break;
				
			case 3:
				System.out.println("Enter the number:");
				int inputNumber3 = Integer.parseInt(in.readLine());
				System.out.println("The number is:"+NumberPallindrome.checkNumberPallindrome(inputNumber3));
				break;
			case 4:
				System.out.println("Enter the space-delimited array to be bubble sorted");
				String inputString = in.readLine();
				String [] tokens = inputString.split(" ");
				ArrayList<Integer> toBeSorted = new ArrayList<Integer>();
				for(int i=0; i<tokens.length; i++)
					toBeSorted.add(Integer.parseInt(tokens[i]));
				BubbleSort.bubbleSort(toBeSorted);
				
			default:
				break;
			}
			System.out.println("1>>>>OddEven\n2>>>>PrimeNumber\n3>>>>NumberPallindrome\n4>>>>BubbleSort\n5>>>>Exit");
			userChoice = Integer.parseInt(in.readLine());
		}while(userChoice != 5);
	}

}
