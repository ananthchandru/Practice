package com.ananth.recursion;

public class CombinationIterative {
	
	public static void main (String[] args) { 
        int arr[] = {1, 2, 3, 4, 5, 6};
        int r = 3;
        int n = arr.length;
        
        for(int i=0; i<r; i++) {
        	for(int j=i+1; j<=r && j<n; j++) {
        		for(int k=j+1; k<n;k++) {
            		System.out.print(arr[i]);
            		System.out.print(arr[j]);
            		System.out.print(arr[k]);
            		System.out.println();
        		}

        	}
        }        
    }
}
