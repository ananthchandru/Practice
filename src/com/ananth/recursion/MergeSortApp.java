package com.ananth.recursion;

public class MergeSortApp {
	
	public static void main(String[] args) {
		int maxSize = 100;
		DArray arr;
		arr = new DArray(maxSize);
		
		arr.insert(64);                
		arr.insert(21); 
		arr.insert(33); 
		arr.insert(70); 
		arr.insert(12); 
		arr.insert(85); 
		
		arr.display();                 // display items
		arr.mergeSort();               // merge sort the array
		arr.display();
		
	}

}
