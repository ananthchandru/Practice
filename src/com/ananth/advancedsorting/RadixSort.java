package com.ananth.advancedsorting;

public class RadixSort {
	
	public static void main(String[] args) {
		int[] arr = {175, 4, 75, 9009, 802};
		int max = findMax(arr);
		System.out.println(max);
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void radixSort(int[] arr, int max) {
		int[] temp = new int[arr.length];
		
		
	}

}
