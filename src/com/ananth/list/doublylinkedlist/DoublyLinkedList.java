package com.ananth.list.doublylinkedlist;

public class DoublyLinkedList {
	
	private DoubleLink first;
	private DoubleLink last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(long dd) {
		DoubleLink newLink = new DoubleLink(dd);
		if(isEmpty())
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(long dd) {
		DoubleLink newLink = new DoubleLink(dd);
		if(isEmpty()) 
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	
	public DoubleLink deleteFirst() {
		DoubleLink temp = first;
		if(first.next == null) 
			last = null;
		else 
			first.next.previous = null;
		
		first = first.next;
		return temp;		
	}
	
	public DoubleLink deleteLast() {
		DoubleLink temp = last;
		if(first.next == null) 
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
	
	public boolean insertAfter(long key, long dd) {
		
		DoubleLink current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null)
				return false;
		}
		DoubleLink newLink = new DoubleLink(dd);
		if(current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	
	public DoubleLink deleteKey(long key) {
		DoubleLink current = first;
		while(current.dData != key ) {
			current = current.next;
			if(current == null)
				return null;
		}
		if(current == first) 
			first = current.next;
		else
			current.previous.next = current.next;

		if(current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		
		return current;
	}
	
	public void displayForward() {
		System.out.println(("Display - First --> Last"));
		DoubleLink current = first;
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public void displayBackward() {
		System.out.println(("Display - Last --> First"));
		DoubleLink current = last;
		while(current!=null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println(" ");
	}

}
