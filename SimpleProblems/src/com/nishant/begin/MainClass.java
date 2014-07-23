package com.nishant.begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nishant.begin.sorting.BubbleSort;
import com.nishant.begin.sorting.QuickSort;

public class MainClass {

	public static void main(String[] args) throws IOException{
		int userChoice;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This is project which has certain simple Java functions.\nFollow the instructions");
		System.out.println("1>>>>OddEven\n2>>>>PrimeNumber\n3>>>>NumberPallindrome\n4>>>>BubbleSort\n5>>>>QuickSort\n6>>>>Exit");
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
			case 5:
				System.out.println("Enter the space-delimited array to be bubble sorted");
				String inputString1 = in.readLine();
				String [] tokens1 = inputString1.split(" ");
				int[] inputArray = new int[tokens1.length];
				for(int i=0; i<tokens1.length; i++)
					inputArray[i] = Integer.parseInt(tokens1[i]);
				QuickSort.quickSort(inputArray, 0, inputArray.length-1);
				
				for(int i=0; i<inputArray.length; i++)
		    		System.out.print(inputArray[i]+" ");
				System.out.println();
				
			default:
				break;
			}
			System.out.println("1>>>>OddEven\n2>>>>PrimeNumber\n3>>>>NumberPallindrome\n4>>>>BubbleSort\n5>>>>QuickSort\n6>>>>Exit");
			userChoice = Integer.parseInt(in.readLine());
		}while(userChoice != 6);
	}

}
