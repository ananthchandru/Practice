package com.ananth.list;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int id) { 
		Link newLink = new Link(id);//new link
		newLink.next = first;//next = first
		first = newLink;//newLINK is assigned to FIRST
	}
	
	public Link deleteFirst() {
		Link temp = first;//store first temp
		first = first.next;
		return temp;//return deleted item
	}

	public void displayList() {
		System.out.println(" List (first --> last: ");
		Link current = first;
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public Link find(int key) {
		Link current = first;
		//till current.iData is the key, 
		//increment current to next
		while(current.iData != key) {
			if(current.next == null) 
				return null;
			else
				current = current.next;
		}
		return current;		
	}
	
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		//till item found, 
		//increment current to current.next
		//increment previous to current
		while(current.iData != key) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		//1. handle if delete is first item in list
		if(current == first)
			first = first.next;
		else //2. handle if delete is not first item in list
		{
			previous.next = current.next;
		}
		return current;
	}
}
