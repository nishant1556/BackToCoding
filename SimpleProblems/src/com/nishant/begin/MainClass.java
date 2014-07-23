package com.nishant.begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.joda.time.DateTime;

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
				DateTime startTime1 = new DateTime();
				BubbleSort.bubbleSort(toBeSorted);
				DateTime endTime1 = new DateTime();
				long difference1 = endTime1.getMillis() - startTime1.getMillis();
				System.out.println();
				System.out.println("BubbleSort took:"+difference1+" milliseconds");
				break;
			case 5:
				System.out.println("Enter the space-delimited array to be quick sorted sorted");
				String inputString1 = in.readLine();
				String [] tokens1 = inputString1.split(" ");
				int[] inputArray = new int[tokens1.length];
				for(int i=0; i<tokens1.length; i++)
					inputArray[i] = Integer.parseInt(tokens1[i]);
				DateTime startTime = new DateTime();
				QuickSort.quickSort(inputArray, 0, inputArray.length-1);
				DateTime endTime = new DateTime();
				long difference = endTime.getMillis() - startTime.getMillis();
				
				System.out.println("QuickSort took:"+difference+" milliseconds");
				
				for(int i=0; i<inputArray.length; i++)
		    		System.out.print(inputArray[i]+" ");
				System.out.println();
				break;
				
			default:
				break;
			}
			System.out.println("1>>>>OddEven\n2>>>>PrimeNumber\n3>>>>NumberPallindrome\n4>>>>BubbleSort\n5>>>>QuickSort\n6>>>>Exit");
			userChoice = Integer.parseInt(in.readLine());
		}while(userChoice != 6);
	}

}
