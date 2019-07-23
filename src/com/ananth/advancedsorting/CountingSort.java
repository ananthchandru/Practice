package com.ananth.advancedsorting;

import java.util.Arrays;

public class CountingSort {
	
	public static void main(String[] args) {
		int[] arr = {5,5,7,77,2,3 };
		int n = arr.length;
		countSort(arr, n);
		for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i]); 
	}
	
	public static void countSort(int[] arr, int n) {
		int[] countArray = new int[256];
		Arrays.fill(countArray, 0);
		
		for(int i=0; i<n; i++ ) {
			++countArray[arr[i]];
		}
		for(int i=1; i<256; i++ ) {
			countArray[i] = countArray[i] + countArray[i-1];
		}
		
		int[] output = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			output[countArray[arr[i]]-1] = arr[i];
			--countArray[arr[i]];
		}
		
		for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
	}
		

}
