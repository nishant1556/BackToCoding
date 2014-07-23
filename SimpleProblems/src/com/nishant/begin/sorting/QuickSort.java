package com.nishant.begin.sorting;

public class QuickSort {
    public static void quickSort(int[] a, int start, int end) {
    	if(start<end) {
    		int p = partition(a, start, end);
    		quickSort(a, start, p-1);
    		quickSort(a, p, end);
    	}
    }
    
    private static int partition(int[] a, int start, int end) {
    	int pivotPos = (start+end)/2;
    	int pivotValue = a[pivotPos];
    	int temp = a[end];
    	a[end] = a[pivotPos];
    	a[pivotPos] = temp;
    	int partition = start;
    	
    	for(int i=start; i<end; i++) {
    		if(a[i] <= pivotValue) {
    			temp = a[partition];
    			a[partition] = a[i];
    			a[i] = temp;
    			partition++;
    		}
    	}
    	
    	return partition;
    }
}
