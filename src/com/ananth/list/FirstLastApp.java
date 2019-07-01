package com.ananth.list;

public class FirstLastApp {
	
	public static void main(String[] args) {
		
		FirstLastList theList = new FirstLastList();
		
		//insertFirst
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		
		//insertLast
		theList.insertFirst(33);
		theList.insertFirst(55);
		theList.insertFirst(77);
		theList.insertFirst(99);
		
		theList.displayList();
		
		//DELETE
		theList.deleteFirst();
		theList.deleteFirst();
		
		
		theList.displayList();
	}

}
