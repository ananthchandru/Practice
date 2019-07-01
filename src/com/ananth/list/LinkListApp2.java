package com.ananth.list;

public class LinkListApp2 {
	
	public static void main(String[] args) {
		
		LinkList theList = new LinkList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		
		theList.displayList();
		
		//FIND
		Link f = theList.find(44);
		
		if(f!=null)
			System.out.println("Found link with key" + f.iData);
		else
			System.out.println("Can't find link");
		
		//DELETE
		Link d = theList.delete(66);
		
		if(d!=null) {
			System.out.println("Deleted link with key" + d.iData);
		} else
			System.out.println("Can't delete link");
		
		theList.displayList();
	}

}
