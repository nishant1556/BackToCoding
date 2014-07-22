package com.nishant.begin.sorting;

import java.util.ArrayList;

public class BubbleSort {
	public static void bubbleSort(ArrayList<Integer> inputArray) {
		ArrayList<Integer> copyOfInput = new ArrayList<Integer>(inputArray);
		int size = inputArray.size();
		for(int i=1; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				if(copyOfInput.get(j) > copyOfInput.get(j+1)) {
					int temp = copyOfInput.get(j);
					copyOfInput.set(j, copyOfInput.get(j+1));
					copyOfInput.set(j+1, temp);
				}
			}
		}
		
		System.out.println("The Sorted Array is:");
		for(int i=0; i<copyOfInput.size(); i++)
			System.out.print(copyOfInput.get(i)+" ");
	}

}
