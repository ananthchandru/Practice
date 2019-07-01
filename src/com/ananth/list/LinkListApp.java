package com.ananth.list;

public class LinkListApp {
	
	public static void main(String[] args) {
		
		LinkList theList = new LinkList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		
		theList.displayList();
		
		while(!theList.isEmpty()) {
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}

}
