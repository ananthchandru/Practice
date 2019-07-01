package com.ananth.list;

public class ListInsertionSortApp {
	
	public static void main(String[] args) {
		int size = 10;
		
		Link[] linkArray =new Link[size];
		
		//Unsorted Array
		for(int i=0;i<size;i++) { // flood array
			int n = (int) (java.lang.Math.random()*99);
			Link newLink = new Link(n);
			linkArray[i] = newLink;
		}
		//display unsorted Array
		for(int i=0;i<size;i++) {
			System.out.print(" " + linkArray[i].iData+" ");
		}
		
		//Insert into sorted List
		SortedList theList = new SortedList(linkArray);
		
		//Remove from list and put in array
		for(int i=0;i<size;i++) {
			linkArray[i] = theList.remove();
		}
		
		//Display sorted Array
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print(" " + linkArray[i].iData+" ");
		}
		
	}

}
