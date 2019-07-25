package com.ananth.tree;

public class Node {
	
	public int iData; //key
	public int dData; //item
	public Node leftChild;
	public Node rightChild;
	
	public void display() {
		System.out.println("{" + iData +"," + dData + "}");
	}

}
