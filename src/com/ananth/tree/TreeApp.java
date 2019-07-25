package com.ananth.tree;

public class TreeApp {
	
	public static void main(String[] args) {
		
		Tree theTree = new Tree();
		
		theTree.insert(50, 15); 
		theTree.insert(25, 12); 
		theTree.insert(75, 17); 
		theTree.insert(12, 15); 
		theTree.insert(37, 12); 
		theTree.insert(43, 17); 
		theTree.insert(30, 15); 
		theTree.insert(33, 12); 
		theTree.insert(87, 17); 
		theTree.insert(93, 15); 
		theTree.insert(97, 15);
		
		theTree.traverse(1);
		theTree.traverse(2);
		theTree.traverse(3);
		
		theTree.find(75);
		theTree.delete(97);
		
		//theTree.displayTree();
		
		
	}

}
